import java.util.Scanner;
import java.time.Year;


/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nickolas Garcia
 */


public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Year yr = Year.now();

        System.out.print("What is your current age? " );
        String age = in.nextLine();

        System.out.print("At what age would you like to retire? " );
        String retire = in.nextLine();

        int a = Integer.parseInt(age);
        int b = Integer.parseInt(retire);
        int diff = b - a;
        int year = Integer.parseInt(yr.toString());
        int newyear = diff + year;

        System.out.println("You have " + diff + " years left until you can retire.");
        System.out.println("It's " + yr + ", so you can retire in " + newyear + ".");


    }


}
