
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        List<String> result = new ArrayList<String>();
        File currentFile = new File(file);
        Scanner scanner = new Scanner(currentFile);
        while (scanner.hasNextLine()) {
            String currentLine = scanner.nextLine();
            result.add(currentLine);
        }
        return result;
    }

    public void save(String file, String text) throws IOException {
        File currentFile = new File(file);
        FileWriter writer = new FileWriter(currentFile);
        if (currentFile.exists()) {
            writer.write(text + "\n");
            writer.close();
        } else {
            currentFile.createNewFile();
            writer.write(text + "\n");
            writer.close();
        }
    }

    public void save(String file, List<String> texts) throws IOException {
        File currentFile = new File(file);
        FileWriter writer = new FileWriter(currentFile);
        for (String text : texts) {
            writer.write(text + "\n");
        }
        writer.close();
    }
}
