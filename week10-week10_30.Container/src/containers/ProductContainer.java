/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author Warglaive
 */
public class ProductContainer extends Container {

    private String Name;

    public ProductContainer(String productName, double capacity) {
        super(capacity);
        this.Name = productName;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String newName) {
        this.Name = newName;
    }

    @Override
    public String toString() {
        return this.Name + ": " + super.toString();
    }
}
