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
public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> hold;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.hold = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int currentWeight = 0;
        for (Suitcase currentSuitcase : hold) {
            currentWeight += currentSuitcase.totalWeight();
        }
        if (currentWeight + suitcase.totalWeight() <= this.maximumWeight) {
            hold.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase suitcase : hold) {
            suitcase.printItems();
        }
    }

    public String toString() {
        int currentWeight = 0;
        for (Suitcase currentSuitcase : hold) {
            currentWeight += currentSuitcase.totalWeight();
        }
        return hold.size() + " suitcases (" + currentWeight + " kg)";
    }
}
