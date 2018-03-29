package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        reverseString();

    }


    public static void reverseString(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        char[] input_string = scan.nextLine().toCharArray();

        for(int i = input_string.length-1; i>=0; i--){

            System.out.print(input_string[i]);

        }

    }
}


