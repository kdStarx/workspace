import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import org.junit.Assert.*;

/**
 * Created by pandeyk on 8/30/2016.
 */
public class FileReaderTest {

    FileReader fileReader = new FileReader();

    @Test
    public void linesListTest() {
        String line = "A big black dog";
        assertEquals(0, fileReader.linesToList(line).size());
    }

    @Test
    public void fileToStreamTest() {
        String fileName = "Sample";
        InputStream stream = getClass().getResourceAsStream(fileName);
        assertEquals(stream,fileReader.fileToStream(fileName));
    }

    @Test
    public void streamToListTest() throws IOException {
        InputStream stream = getClass().getResourceAsStream("Sample");
        assertNotNull(fileReader.streamToList(stream));
    }
}
