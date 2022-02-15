package scanner;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {

        //SYNTAX: Scanner obj= new Scanner(System.in);

        Scanner obj= new Scanner(System.in);

        // Reading String input

        System.out.println("Please enter your name");

        String name= obj.nextLine(); // Reads String input

        System.out.println("You have entered name as "+name);

        // Reading Integer input

        System.out.println("Please enter your Age");

        int age = obj.nextInt(); // reads integer input
        System.out.println("You have entered Age as "+age);

        // Reading decimal values
        System.out.println("Please enter your Salary");
        double salary = obj.nextDouble();// reads decimal values

        System.out.println("You have entered Salary  as "+salary);

    }
}
