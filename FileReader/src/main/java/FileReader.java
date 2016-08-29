import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by pandeyk on 8/29/2016.
 */
public class FileReader {
    private List<String> linesList = new ArrayList<String>();

    public List<String> getLinesList() {
        return linesList;
    }

    public void setLinesList(List<String> linesList) {
        this.linesList = linesList;
    }

    // Add lines to existing list
    public List<String> linesToList(String line) {
        System.out.println("Size of list before reading line "+linesList.size());
        System.out.println("Line to be added "+line);
        linesList.add(line);
        System.out.println("Size of list after reading line "+linesList.size());
        return linesList;
    }

    public InputStream fileToStream (String fileName) {
        System.out.println("FIleName is "+fileName);
        InputStream stream = getClass().getResourceAsStream(fileName);
        return stream;
    }

    public List<String> streamToList(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        List<String>  list = new ArrayList<String>();
        String line;
        while ((line = bufferedReader.readLine())!=null){
            list = linesToList(line);
        }
        return list;
    }

    public List<String> sortedList (List<String> list) {
        Collections.sort(list);
        return list;
    }

}
