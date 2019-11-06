
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Warglaive
 */
public class Dictionary {

    private HashMap<String, String> wordTranslation;

    public Dictionary() {
        this.wordTranslation = new HashMap<String, String>();
    }

    public String translate(String word) {
        return this.wordTranslation.get(word);

    }

    public void add(String word, String translation) {
        this.wordTranslation.put(word, translation);
    }

    public int amountOfWords() {
        return this.wordTranslation.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> list = new ArrayList<String>();
        for (String string : this.wordTranslation.keySet()) {
            list.add(string + " = " + this.wordTranslation.get(string));
        }
        return list;
    }
}
