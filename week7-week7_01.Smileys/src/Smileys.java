
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        //printWithSmileys("Method");
        //printWithSmileys("\\:D/");
        printWithSmileys("Matti");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        String smiley = ":)";
        //add space
        if (characterString.length() % 2 == 1) { //If odd
            characterString += " ";
        }
        characterString = " " + characterString + " ";
        PrintTopBottom(characterString, smiley);
        //Mid
        System.out.print(smiley);
        System.out.print(characterString);
        System.out.print(smiley);
        System.out.println();
        //Bottom
        PrintTopBottom(characterString, smiley);
    }

    private static void PrintTopBottom(String characterString, String smiley) {
        //Print Top
        for (int i = 0; i < (characterString.length() / 2) + 2; i++) {
            System.out.print(smiley);
        }
        System.out.println();
    }
}
