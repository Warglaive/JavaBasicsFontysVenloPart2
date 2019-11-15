
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

    private Map<String, Purchase> basket;

    public ShoppingBasket() {
        this.basket = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        if (this.basket.containsKey(product)) {
            this.basket.get(product).increaseAmount();
        } else {
            this.basket.put(product, new Purchase(product, 1, price));
        }
    }

    public int price() {
        int sum = 0;
        for (Purchase purchase : this.basket.values()) {
            sum += purchase.price();
        }
        return sum;
    }

    public void print() {
        for (Purchase purchase : this.basket.values()) {
            System.out.println(purchase.toString());
        }
    }
}
