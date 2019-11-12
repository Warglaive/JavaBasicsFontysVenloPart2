
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Warglaive
 */
public class ShoppingBasket {

    private List<Purchase> basket;

    public ShoppingBasket() {
        this.basket = new ArrayList<Purchase>();
    }

    public void add(String product, int price) {
        for (Purchase purchase : this.basket) {
           
        }
        Purchase purchase = new Purchase(product, price, 1);
        this.basket.add(purchase);
    }

    public int price() {
        int sum = 0;
        for (Purchase purchase : this.basket) {
            sum += purchase.price();
        }
        return sum;
    }

    public void print() {
        for (Purchase purchase : this.basket) {
            purchase.toString();
        }
    }
}
