/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day2;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author meyer
 */
public class Day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random rand = new Random();
        Scanner myObj = new Scanner(System.in);
        
        int iRandom = rand.nextInt(15+1);
        
        System.out.println("Hello!");
        System.out.println("Let's play a game,");
        System.out.println("a random number between 1 and 15 has been generated. Guess the number correct.");
        
        String answer = myObj.nextLine();
        
        int iAns = Integer.parseInt(answer);
        int iAns2 = 0;
        
        if (iAns > iRandom){
           System.out.println("Too big. Please try again!"); 
        } else if (iAns < iRandom) {
           System.out.println("Too small. Please try again!");
        } else {
            System.out.println("You win!");
        }
        
        while (iAns != iRandom || iAns2 != iRandom)  {
            
            System.out.println("Sorry you have guessed incorrect. Please try again!");
        
            String answer2 = myObj.nextLine();
        
            iAns2 = Integer.parseInt(answer2);
            
            if (iAns2 > iRandom){
                System.out.println("Too big. Please try again!"); 
            }
            
            if (iAns2 < iRandom){
                System.out.println("Too small. Please try again!"); 
            }
            
            if (iAns2 == iRandom) {
                
                System.out.println("Congratulations, you have won the game!");
                break;
            }
            
        }
        
        
        
        
        
        
    }
    
}
