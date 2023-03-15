/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Ste-PC
 */
public class UserInterface {

    private Scanner scanner;
    private BirdList birdList;

    public UserInterface(Scanner scanner, BirdList birdList) {
        this.scanner = scanner;
        this.birdList = birdList;
    }

    public void startProgramme() {
        while (true) {
            System.out.println("?");
            String command = this.scanner.nextLine();
            if (command.equals("Quit") || command.equals("quit")) {
                break;
            } else if (command.equals("Add") || command.equals("add")) {
                addBird();
            } else if (command.equals("All") || command.equals("all")) {
                this.birdList.printBirds();
            } else if (command.equals("Observation") || command.equals("observation")) {
                observeBird();
            } else if (command.equals("One") || command.equals("one")){
                printOneBird();
            }
        }
    }
    
    public void printOneBird(){
        System.out.println("Bird?");
        String searchedBird = scanner.nextLine();
        for(Bird bird: birdList.getBirdList()){
            if(bird.getName().equals(searchedBird)){
                System.out.println(bird);
            }
        }
    }
    
    public void addBird(){
        System.out.println("Name:");
        String name = this.scanner.nextLine();
        System.out.println("Name in Latin:");
        String latinName = this.scanner.nextLine();
        birdList.addBird(new Bird(name, latinName));
    }
    
    public void observeBird(){
        System.out.println("Bird?");
        String observed = scanner.nextLine();
        boolean observationCompleted = false;
        for (Bird bird : birdList.getBirdList()) {
            if (bird.getName().equals(observed)) {
                bird.observeBird();
                observationCompleted = true;
            }
        }
        if (!observationCompleted) {
            System.out.println("Not a bird!");
        }
    }
}
