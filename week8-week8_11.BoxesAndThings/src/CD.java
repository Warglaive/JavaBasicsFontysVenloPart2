/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Warglaive
 */
public class CD implements ToBeStored {

    public String Artist;
    public String Title;
    public int YearOfPublish;
    public double Weight;

    public CD(String artist, String title, int yearOfPublish) {
        this.Artist = artist;
        this.Title = title;
        this.YearOfPublish = yearOfPublish;
        this.Weight = 0.1;
    }

    @Override
    public double weight() {
        return this.Weight;
    }

    public String toString() {
        return this.Artist + ": " + this.Title + " (" + this.YearOfPublish + ")";
    }
}
