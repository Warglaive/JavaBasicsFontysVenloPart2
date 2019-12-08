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

    public MindfulDictionary() {
        this.Dictionary = new HashMap<String, String>();
    }

    public MindfulDictionary(String file) throws FileNotFoundException {
        this.Dictionary = new HashMap<String, String>();
        this.FilePath = file;
    }

    public boolean load() {
        try {
            File currentFile = new File(this.FilePath);
            Scanner fileReader = new Scanner(currentFile);
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                String key = parts[0];
                String value = parts[1];
                this.add(key, value);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void add(String word, String translation) {
        if (!this.Dictionary.containsKey(word)) {
            this.Dictionary.put(word, translation);
        }
    }

    public String translate(String word) {
        String result = "";
        if (this.Dictionary.get(word) != null) {
            result = this.Dictionary.get(word);
        } else if (this.Dictionary.values().contains(word)) {
            for (String key : this.Dictionary.keySet()) {
                if (this.Dictionary.get(key).equals(word)) {
                    result = key;
                }
            }
        } else {
            result = null;
        }
        return result;
    }

    public void remove(String word) {
        int oldSize = this.Dictionary.size();
        this.Dictionary.remove(word);
        if (oldSize == this.Dictionary.size()) {
            for (String key : this.Dictionary.keySet()) {
                //take word's KEY and remove it by the key
                if (this.Dictionary.get(key).equals(word)) {
                    this.Dictionary.remove(key);
                    return;
                }
            }
            this.Dictionary.remove(word, this.Dictionary.get(word));
        }
    }

    public boolean save() {
        try {
            File file = new File(this.FilePath);
            FileWriter writer = new FileWriter(file);
            for (String key : this.Dictionary.keySet()) {
                String Key = key;
                String value = this.Dictionary.get(Key);
                String result = key + ":" + value;
                writer.write(result + "\n");
            }
            writer.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
