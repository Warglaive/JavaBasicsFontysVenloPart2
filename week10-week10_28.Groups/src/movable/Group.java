/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Warglaive
 */
public class Group implements Movable {

    private List<Movable> Group;

    public Group() {
        this.Group = new ArrayList<Movable>();
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : this.Group) {
            movable.move(dx, dy);
        }
    }

    public void addToGroup(Movable organism) {
        this.Group.add(organism);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Movable movable : this.Group) {
            result.append(movable.toString()+"\n");
        }
        return result.toString();
    }
}
