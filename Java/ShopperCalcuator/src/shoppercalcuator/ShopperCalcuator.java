package shoppercalcuator;
import java.util.*;

/**
 * 
 * 
 * @author meyer-dev
 */
public class ShopperCalcuator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String first, second, third, fourth, fifth;
        double ifirst, isecond, ithird, ifourth, ififth;
        double totalAmount = 0;
        
        
        System.out.print("Enter the name of the first item you want to buy: ");
        first = myObj.next();
        System.out.print("Enter the price of the first item: R");
        //ifirst = myObj.nextDouble();
        ifirst = myObj.nextDouble();
        
        System.out.print("Enter the name of the second item you want to buy: ");
        second = myObj.next();
        System.out.print("Enter the price of the second item: R");
        isecond = myObj.nextDouble();
        
        System.out.print("Enter the name of the third item you want to buy: ");
        third = myObj.next();
        System.out.print("Enter the price of the third item: R");
        ithird = myObj.nextDouble();
        
        System.out.print("Enter the name of the fourth item you want to buy: ");
        fourth = myObj.next();
        System.out.print("Enter the price of the fourth item: R");
        ifourth = myObj.nextDouble();
        
        System.out.print("Enter the name of the fifth item you want to buy: ");
        fifth = myObj.next();
        System.out.print("Enter the price of the fifth item: R");
        
        ififth = myObj.nextDouble();
        
        System.out.println("===================================================");
        System.out.println("You have selected to buy the folowing items: ");
        
        System.out.println("---------------------------------------------------");
        
        System.out.println("Item: " + first + " at R" + ifirst);
        System.out.println("Item: " + second + " at R" + isecond);
        System.out.println("Item: " + third + " at R" + ithird);
        System.out.println("Item: " + fourth + " at R" + ifourth);
        System.out.println("Item: " + fifth + " at R" + ififth);
        
        System.out.println("---------------------------------------------------");
        
        double total = ifirst + isecond + ithird + ifourth + ififth;
        System.out.println("Total for all items : R" + total);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
