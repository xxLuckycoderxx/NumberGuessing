import java.util.Scanner;

import static java.lang.Math.random;

public class NumberGuessing {
    public static void main(String[]args){

     Scanner keyboard;
     int input;
     int chosenNumber;
     chosenNumber= (int)(Math.random()* 100);
     keyboard=new Scanner(System.in);


     System.out.println("Enter a random number !");
     input=keyboard.nextInt();

     if(input==chosenNumber){
     System.out.println("Great Job !");
   }


    }
}
