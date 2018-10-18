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






     Scanner keyboard;
     keyboard=new Scanner(System.in);
     boolean mag = true;
     int numb;
     int dose=(int)(Math.random()*100);


     System.out.println("Please enter a value from 1-100");
     numb=keyboard.nextInt();
     do {
      if( numb >dose){
       System.out.println("Too hot");
      } mag=false;
      elseif(numb<dose){
       System.out.println("Tooo cold");
      }
            else if(numb==dose){
       System.out.println("Bingo");
      }break;






     }
}
