/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Warglaive
 */
public class Analysis {

    private File CurrentFile;

    public Analysis(File file) {
        this.CurrentFile = file;
    }

    public int lines() throws FileNotFoundException {
        int linesCounter = 0;
        Scanner scanner = new Scanner(this.CurrentFile);
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            linesCounter++;
        }
        return linesCounter;
    }

    public int characters() throws FileNotFoundException {

        Scanner scanner = new Scanner(this.CurrentFile);
        StringBuilder chars = new StringBuilder();
        while (scanner.hasNextLine()) {
            chars.append(scanner.nextLine());
        }
        int count = 0;
        for (int i = 0; i < chars.toString().length(); i++) {
            count++;
        }
        return count + lines();
    }
}
