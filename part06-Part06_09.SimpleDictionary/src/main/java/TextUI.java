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
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start() {
        String input;
        String word;
        String translation;
        String search;

        while (true) {
            System.out.println("Command:");
            input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            if (input.equals("add")) {
                System.out.println("Word:");
                word = scanner.nextLine();
                System.out.println("Translation:");
                translation = scanner.nextLine();
                dict.add(word, translation);
                continue;
            }
            if (input.equals("search")) {
                System.out.println("To be translated:");
                search = scanner.nextLine();
                if (this.dict.get(search) == null) {
                    System.out.println("Word " + search + " was not found");
                } else {
                    System.out.println("Translation: " + this.dict.get(search));
                }
                continue;
            }
            System.out.println("Unknown command");
        }

    }
}
