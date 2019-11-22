/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

/**
 *
 * @author Warglaive
 */
public class Organism implements Movable {

    private int X;
    private int Y;

    public Organism(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    public String toString() {
        return "x: " + this.X + "; " + "y: " + this.Y;
    }

    @Override
    public void move(int dx, int dy) {
        this.X += dx;
        this.Y += dy;
    }
}
