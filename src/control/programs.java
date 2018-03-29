package control;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class programs {

    public static void main(String arg[]){
        pallindromeNumber();
    }

    @NotNull
    public static Integer getNumber (){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        return scan.nextInt();
    }

    public static void printSt(String outputString){

        System.out.println(outputString);
    }


    public static void fibonacciSeries(){
        Integer input = getNumber();
        List<Integer> output = new ArrayList<>();
        output.add(0);
        output.add(1);
        for(int j=0; j<=input-3;j++){
            output.add(output.get(output.size()-1)+output.get(output.size()-2));
        }

        printSt(output.toString());
    }

    public static void primeNumber(){

        Integer input = getNumber();

        if(input==0||input==1){printSt(input + " is not a prime number.");}
        else if(input==2||input==3){printSt(input + " is a prime number.");}
        else{
            for(int i=2; i<=input/2; i++){
                if(input%i==0){
                    printSt(input + " is not a prime number.");
                    break;
                                    }
                printSt(input + " is a prime number.");
                break;

            }
        }
    }

    public static void pallindromeNumber(){
        Integer input = getNumber();
        char[] in = input.toString().toCharArray();
        StringBuilder rev_in = new StringBuilder("");
        for(int i=in.length-1; i>=0;i--){
            rev_in.append(in[i]);
        }
        if(input.toString().equals(rev_in.toString())){
            printSt(input + " is a Pallindrome Number");

        }else{printSt(input + " is not a Pallindrome Number");}

    }

}
