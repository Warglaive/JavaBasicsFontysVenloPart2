
import java.util.ArrayList;
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
public class TextUserInterface {

    private Dictionary Dict;
    private Scanner read;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.read = reader;
        this.Dict = dictionary;
    }

    public void start() {
        PrintAllStatements();
        System.out.print("Statement: ");
        String statement = this.read.nextLine();

        while (statement != "quit") {
            if (statement.equals("add")) {
                add();
            } else if (statement.equals("translate")) {
                translate();
            } else if (statement.equals("quit")) {
                System.out.println("Cheers!");
                return;
            } else {
                System.out.println("Unknown statement.");
            }
            System.out.print("Statement: ");
            statement = this.read.nextLine();
        }

    }

    public void PrintAllStatements() {
        ArrayList<String> statementsList = new ArrayList<String>();
        statementsList.add("  add - adds a word pair to the dictionary");
        statementsList.add("  translate - asks a word and prints its translation");
        statementsList.add("  quit - quits the text user interface");

        System.out.println("Statements: ");
        for (String statement : statementsList) {
            System.out.println(statement);
        }
    }

    public void add() {
        System.out.print("In Finnish: ");
        String toBeTranslated = read.nextLine();
        System.out.print("Translation: ");
        String translation = this.read.nextLine();
        this.Dict.add(toBeTranslated, translation);
    }

    public void translate() {
        System.out.print("Give a word: ");
        String wordToBeTranslated = this.read.nextLine();
        System.out.println("Translation: " + this.Dict.translate(wordToBeTranslated));
    }
}
