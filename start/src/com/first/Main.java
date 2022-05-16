package com.first;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input;
        String help = "Hii So this program works as follows:\n" +
                      "1) You have to enter a number.\n" +
                      "2) If the number is divisible by 5 it prints \"Fizz\".\n" +
                      "3) If the number is divisible by 3 it prints \"Buzz\".\n" +
                      "4)And if the number divisible by both 5&3 it prints \"Fizz Buzz!\".\n" +
                      "5) If you want to leave the program enter any -ve number.";

           System.out.println("Need help just enter \"0\"");
       do {
            System.out.print("Number: ");
            input = sc.nextInt();
        if (input%5 == 0 && input%3 == 0 && input != 0){
            System.out.println("Fizz Buzz!");
        }
        else if (input % 5 == 0 && input != 0) {
            System.out.println("Fizz!");
        } else if (input % 3 == 0 && input != 0) {
            System.out.println("Buzz!");
        }
        else if(input != 0){
            System.out.println(input);
        } else if (input == 0) {
            System.out.println(help);
        }
    } while (input > -1);
        System.out.println("You're out of program now...:)");
    }

}
