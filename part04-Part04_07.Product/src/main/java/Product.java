/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ste-PC
 */
public class Product {
    private double price;
    private int quantity;
    private String name;
    
    public Product(String initialName, double initialPrice, int initialQuantity){
        this.price = initialPrice;
        this.quantity = initialQuantity;
        this.name = initialName;
    }
    
    public void printProduct(){
        System.out.println(this.name + ", price " + price + ", " + quantity + " pcs");
    }
}
