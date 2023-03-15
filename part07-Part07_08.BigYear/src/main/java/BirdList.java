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
public class BirdList {
    private ArrayList<Bird> listOfBirds;
    
    public BirdList(){
        listOfBirds = new ArrayList<>();
    }
    
    public void addBird(Bird bird){
        if(!(this.listOfBirds.contains(bird))){
            this.listOfBirds.add(bird);
        }
    }
    
    public void printBirds(){
        for(Bird bird : listOfBirds){
            System.out.println(bird);
        }
    }
    
    public ArrayList<Bird> getBirdList(){
        return this.listOfBirds;
    }
}


