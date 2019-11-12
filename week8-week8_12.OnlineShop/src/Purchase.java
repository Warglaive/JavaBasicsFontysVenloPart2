/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Warglaive
 */
public class Purchase {

    private String Product;
    private int Amount;
    private int UnitPrice;

    public Purchase(String product, int amount, int unitPrice) {
        this.Product = product;
        this.Amount = amount;
        this.UnitPrice = unitPrice;
    }

    public int price() {
        return this.UnitPrice * this.Amount;
    }

    public void increaseAmount() {
        this.Amount++;
    }

    @Override
    public String toString() {
        return this.Product + ": " + this.Amount;
    }
}
