/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Warglaive
 */
public class Change {

    private char fromChar;
    private char toChar;

    public Change(char fromCharacter, char toCharacter) {
        this.fromChar = fromCharacter;
        this.toChar = toCharacter;
    }

    public String change(String characterString) {
      return characterString.replace(this.fromChar, this.toChar);
    }
}
