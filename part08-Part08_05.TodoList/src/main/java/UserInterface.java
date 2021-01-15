/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ericjiang
 */
import java.util.Scanner;

public class UserInterface {

    private TodoList thelist;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.thelist = list;
    }

    public void start() {
        System.out.println("Command:");
        String hello = scanner.nextLine();
        while (true) {

            if (hello.equalsIgnoreCase("stop")) {
                break;
            }
            if (hello.equalsIgnoreCase("add")) {
                System.out.println("To add:");
                String add = scanner.nextLine();
                thelist.add(add);

            }
            if (hello.equalsIgnoreCase("list")) {
                thelist.print();

            }
            if (hello.equalsIgnoreCase("remove")) {
                System.out.println("Which one is removed?");
                int counter = Integer.valueOf(scanner.nextLine());
                thelist.remove(counter);

            }
            System.out.println("Command:");
            hello = scanner.nextLine();

        }
    }

}
