/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Ste-PC
 */
public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager(){
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        jokes.add(joke);
    }
    
    public String drawJoke(){
        if(jokes.size() == 0){
            return "Jokes are in short supply.";
        }
        Random rand = new Random();
        int index = rand.nextInt(jokes.size());
        return jokes.get(index);
    }
    
    public void printJokes(){
        for(String joke : jokes){
            System.out.println(joke);
        }
    }
}
