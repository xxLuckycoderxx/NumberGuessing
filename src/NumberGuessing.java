import java.util.Scanner;

import static java.lang.Math.random;

public class NumberGuessing {
    public static void main(String[]args){
        
     int input;
     int chosenNumber;
       
        
     Scanner keyboard;
     keyboard=new Scanner(System.in);
    
        
     
        
     chosenNumber= (int)(Math.random()* 100);
     


     System.out.println("Enter a random number !");
     input=keyboard.nextInt();

     if(input==chosenNumber){
     System.out.println("Great Job !");
     }
     else
     System.out.print("Try Again!");
    }
}
