/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Warglaive
 */
public class Book implements ToBeStored {

    public String Writer;
    public String Name;
    public double Weight;

    public Book(String writer, String name, double weight) {
        this.Writer = writer;
        this.Name = name;
        this.Weight = weight;
    }

    @Override
    public double weight() {
        return this.Weight;
    }

    @Override
    public String toString() {
        return this.Writer + ": " + this.Name;
    }
}
