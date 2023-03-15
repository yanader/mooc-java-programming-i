/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Ste-PC
 */
public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;
    
    public UserInterface(TodoList todoList, Scanner scanner){
        this.scanner = scanner;
        this.todoList = todoList;
    }
    
    public void start(){
        String input;
        String taskToAdd;
        int removedIndex;
        
        while(true){
            System.out.println("Command:");
            input = scanner.nextLine();
            if(input.equals("stop")){
                break;
            }
            if(input.equals("add")){
                System.out.println("To add:");
                taskToAdd = scanner.nextLine();
                todoList.add(taskToAdd);
                continue;
            }
            if(input.equals("list")){
                todoList.print();
                continue;
            }
            if(input.equals("remove")){
                System.out.println("Which one is removed?");
                removedIndex = Integer.valueOf(scanner.nextLine());
                todoList.remove(removedIndex);
            }
        }
    }
}
