
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Warglaive
 */
public class Printer {

    private String FileName;

    public Printer(String fileName) throws Exception {
        this.FileName = fileName;
    }

    public void printLinesWhichContain(String word) throws FileNotFoundException {
        File file = new File(this.FileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.contains(word)) {
                System.out.println(line);
            }
        }
        scanner.close();
    }
}
