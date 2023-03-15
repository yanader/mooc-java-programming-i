/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author Ste-PC
 */
public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> suitcase;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcase = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        int weight = 0;
        for(Item currentItem:this.suitcase){
            weight += currentItem.getWeight();
        }    
        if (weight + item.getWeight() <= this.maxWeight) {
            this.suitcase.add(item);
        }
    }
    
    public void printItems(){
        for(Item item: suitcase){
            System.out.println(item.toString());
        }
    }
    
    public int totalWeight(){
        int weight = 0;
        for(Item currentItem:this.suitcase){
            weight += currentItem.getWeight();
        }
        return weight;
    }
    
    public Item heaviestItem(){
        if(this.suitcase.size() == 0){
            return null;
        }
        Item returnItem = suitcase.get(0);
        for(Item item : suitcase){
            if(item.getWeight() > returnItem.getWeight()){
                returnItem = item;
            }
        }
        return returnItem;
    }

    public String toString() {
        int weight = 0;
        for(Item currentItem:this.suitcase){
            weight += currentItem.getWeight();
        }
        
        if (suitcase.size() == 0) {
            return "no items (0 kg)";
        } else if (suitcase.size() == 1) {
            return suitcase.size() + " item (" + weight + " kg)";
        } else {
            return suitcase.size() + " items (" + weight + " kg)";
        }

    }
}
