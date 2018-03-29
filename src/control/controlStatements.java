package control;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class controlStatements {

    public static void main(String arg[]){

        doWhileLoopExample();

    }

    public static void ifelseExample(){

        int marks;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        marks = scan.nextInt();

        if(marks<50){
            System.out.println("You are fail.");
        }

        else if(marks>=50 && marks<60){
            System.out.println("You got D Grade.");
        }

        else if(marks>=60 && marks<70){
            System.out.println("You got C Grade.");
        }

        else if(marks>=70 && marks<80){
            System.out.println("You got B Grade.");
        }

        else if(marks>=80 && marks<90){
            System.out.println("You got A Grade.");
        }

        else if(marks>=90 && marks<100){
            System.out.println("You got A+ Grade.");
        }

        else{
            System.out.println("Invalid Input: "+ marks);
        }

    }

    public static void switchExample(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = scan.nextInt();

        switch(age){
            case 10:
                System.out.println(age);
                break;
            case 20:
                System.out.println(age);
                break;
            default:
                System.out.println("Your age is not 10 or 20");

        }
    }

    public static void forLoopExample(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        char[] name = scan.nextLine().toCharArray();
        System.out.println("Your Reverse Name:");

        for(int i = name.length-1; i>=0; i--){
            System.out.print(name[i]);
        }

    }

    public static void whileLoopExample(){

//        Array is a data structure generally consisting of sequential memory storing a collection of objects.
//        List is an interface in Java, which means that it may have multiple implementations.
//        One of these implementations is ArrayList, which is a class that implements the behavior of the
//        List interface using arrays as the data structure.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String st = scan.nextLine();
        System.out.println("Print number of times: ");
        Integer number = scan.nextInt();
        System.out.println(st);
        while(number>=0){
            System.out.println(st);
            number--;
        }
    }

    public static void doWhileLoopExample(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Integer number = scan.nextInt();
        do{
            System.out.println(number);
            if(number == 1){break;}
            number --;

        }while(number>=0);

    }

}

