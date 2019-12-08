package dictionary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        MindfulDictionary s = new MindfulDictionary("test/words.txt");
        s.load();
        s.translate("olut");
        s.save();
    }
}
