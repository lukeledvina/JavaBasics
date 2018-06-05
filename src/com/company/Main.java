package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//            int add = 5 + 4;
//
//            int subtract = 5 - 4;
//
//            int multiply = 5 * 4;
//


        String hello = "Hi!";
        String name = "Luke";
        String age = "Fourteen";

        Scanner input = new Scanner(System.in);
//
//        System.out.println("What is your favorite game?");
//
//        game = input.nextLine();
//
//        System.out.println(response + " " + game + " is my favorite game too man!");



        System.out.println("What is your age?");
        String age = input.nextLine();


        System.out.println("What would you like for me to call you?");

        name = input.nextLine();

        System.out.println(hello + name + "! " + "You are " + age);


    }
}

