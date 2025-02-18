/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package first.test;
import java.util.Scanner;

/**
 *
 * @author meyer
 */
public class FirstTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Day 1
        
        System.out.println("Hello World from Java");
        //The following two print lines will output the exact same thing
        System.out.println("2");
        System.out.println(2);
        
        //Im starting with variables
        
        String name = "Dean";
        int age = 17;
        String employment = "student";
        String PlaceOfEmployment = "CPUT";
        String studying = "applications development";
        
        System.out.println("My name is " + name + ". I am " + age + " years old and am a " + employment + " at " + PlaceOfEmployment + " currently studying " +
                studying);
        
        Scanner myObj = new Scanner(System.in);
        
        
        System.out.println("Is the above senetence correct? (y/n)");
        String Answer = myObj.nextLine();
        
        
        String sAns = Answer.toLowerCase();
        
        if (sAns.equals("y")) {
            System.out.println("Thank you " + name + ". Enjoy the rest of your day!");
        } else if (sAns.equals("n")) {
            System.out.println("Which piece of information would you like to change?");
            
            
            System.out.println("Name - n, Age - a, Employment - e");
            String sChange = myObj.nextLine();
            
            sChange = sChange.toLowerCase();
            
            if (sChange.equals("n")) {
                
                System.out.println("What would you like your new name to be?");
                String sNameChange = myObj.nextLine();
                
                name = sNameChange;
            } else if (sChange.equals("a")) {
                
                System.out.println("What would you like your new age to be?");
                String sAgeChange = myObj.nextLine();
                
                age = Integer.parseInt(sAgeChange);
            } else if (sChange.equals("e")) {
                
                System.out.println("What would you like your new employment to be?");
                String sEmploymentChange = myObj.nextLine();
                
                employment = sEmploymentChange;
            } else {
                System.out.println("Invalid selection. Exiting program...");
            }
            
            System.out.println("My name is " + name + ". I am " + age + " years old and am a " + employment + " at " + PlaceOfEmployment + " currently studying " +
                studying);
        
    } else {
             System.out.println("Invalid selection. Exiting program...");
        }
        
        //Rest of program continues here:
        //Day 2
        
        System.out.println("Yayayayayayayayayay");
        
        System.out.println("Are you a computer genius? (y/n)");
        
        String bAns = myObj.nextLine();
        
        if (bAns.equals("y")) {
            System.out.println("Yes, you are " + name + ". You should be proud of yourself!");
        } else if (bAns.equals("n")) {
            System.out.println("That is not the right answer " + name + " and you know it.");
        } else {
            System.out.println("Please enter a valid option.");
        }
        
        
    }
}
