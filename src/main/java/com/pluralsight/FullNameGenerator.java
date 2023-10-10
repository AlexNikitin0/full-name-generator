package com.pluralsight;
import java.sql.SQLOutput;
import java.util.Scanner;
public class FullNameGenerator {

    public static void main(String[] args) {
        //declare variables
        Scanner keyboard = new Scanner(System.in);
        String firstName;
        String lastName;
        String middleName;
        String suffix;

        System.out.print("Enter your First Name: ");
        firstName = keyboard.nextLine();
        System.out.print("Enter your middle Name: ");
        middleName = keyboard.nextLine();
        System.out.print("Enter your Last Name: ");
        lastName = keyboard.nextLine();

        System.out.print("Enter your suffix: ");
        suffix = keyboard.nextLine();
        int length = suffix.length();
        if(length > 0)
        {
            lastName = lastName + ", ";

        }


        System.out.println("Your full name is: " + firstName + " " + middleName + " " +
                lastName  + suffix);




    }
}
