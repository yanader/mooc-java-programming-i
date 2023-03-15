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
public class TodoList {
    private ArrayList<String> list;
    
    public TodoList(){
        this.list = new ArrayList<String>();
    }
    
    public void add(String task){
        list.add(task);
    }
    
    public void print(){
        for(String task : list){
            System.out.println((list.indexOf(task)+1) + ": " + task);
        }
    }
    
    public void remove(int number){
        list.remove(number-1);
    }
}
