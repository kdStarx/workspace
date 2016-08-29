import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by pandeyk on 8/29/2016.
 */
public class FileReaderMain {

    public static void main(String[] args) throws IOException {
        String fileName = "Sample";
        FileReader fileReader = new FileReader();

        List<String> oldList = fileReader.streamToList(fileReader.fileToStream(fileName));
        System.out.println("Sorted List ..");
        List<String> sortedList = fileReader.sortedList(oldList);

        Iterator iterator = sortedList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
