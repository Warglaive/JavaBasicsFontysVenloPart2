/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;

/**
 *
 * @author Warglaive
 */
public class MindfulDictionary {

    private HashMap<String, String> Dictionary;

    public MindfulDictionary() {
        this.Dictionary = new HashMap<String, String>();
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
}
