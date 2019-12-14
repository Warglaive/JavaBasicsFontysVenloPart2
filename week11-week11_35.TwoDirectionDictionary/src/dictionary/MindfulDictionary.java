/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Warglaive
 */
public class MindfulDictionary {

    private HashMap<String, String> Dictionary;
    private String FilePath;

    public MindfulDictionary(String file) {
        this.Dictionary = new HashMap<String, String>();
        this.FilePath = file;
    }

    public boolean save() {
        try {
            File currentFile = new File(this.FilePath);
            FileWriter writer = new FileWriter(currentFile);
            for (String key : this.Dictionary.keySet()) {
                writer.write(key + ":" + this.Dictionary.get(key)+"\n");
            }
            writer.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean load() {
        try {
            File currentFile = new File(this.FilePath);
            Scanner scanner = new Scanner(currentFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public MindfulDictionary() {
        this.Dictionary = new HashMap<String, String>();
    }

    public void add(String word, String translation) {
        if (!this.Dictionary.containsKey(word)) {
            this.Dictionary.put(word, translation);
        }
    }

    public String translate(String word) {
        String result = null;
        if (this.Dictionary.get(word) != null) {
            result = this.Dictionary.get(word);
        } else {
            for (String key : this.Dictionary.keySet()) {
                if (this.Dictionary.get(key).equals(word)) {
                    result = key;
                }
            }
        }
        return result;
    }

    public void remove(String word) {
        if (this.Dictionary.remove(word) == null) {
            for (String key : this.Dictionary.keySet()) {
                if (this.Dictionary.get(key).equals(word)) {
                    this.Dictionary.remove(key);
                    return;
                }
            }
        }
    }
}
