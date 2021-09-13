package org.example;
import java.util.Scanner;

/**
 * Counting the Number of Characters
 * UCF cop3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Zeb Fischer-Crawford
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println( "What is the input string? " );
        String input = scan.nextLine();

        System.out.println(input + " has " + input.length() + " characters.");
    }
}
