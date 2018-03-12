/**********************************************************************************
// Title:      calculate change
// Course:     CSC 3020
// Homework:   4-1
// Author:     Gayatari patel
// Date:       22 October 2016
// Description: Java application that determines the amount and type of change to return to a customer for a given sale.
//
//**********************************************************************************
 */
package change;
 // scanner
import java.util.Scanner;
public class change {
	
      //................ main
	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner(System.in);
		// variables
        double price; 
        double paid;
        System.out.println("Wel come to the change counting program");
        System.out.println("........................................");
        System.out.print("\nEnter the product price or (-22 to exit): $");
        // user input price 
        price = keyboard.nextDouble();
 	  // Loop will continue till user input -22
       while(price!=-22)
       {
            // validation loop for price range (1-8)
           while (price < 1 || price>8)
           {
               System.out.println("The sale price range is from (1-8)");
               System.out.print("\nEnter the product price or (-22 to exit): $");
               price = keyboard.nextDouble();
               
           } 
           // paid amount input
           System.out.print("Enter the amount given by the customer: $");
          paid = keyboard.nextDouble();
          //a validation loop to for  the amount tendered by the customer to insure it is at least the sale amount. 
           while (paid < price) 
           {
               System.out.println("Not enough money! price have to be grater or equal to the prodect price $ "+price);
               System.out.print("Enter the amount given by the customer: $");
               paid = keyboard.nextDouble();
           System.out.println();
           }
           System.out.println();
           System.out.printf("%-25s%4.2f%n","The sale price for product:  $",price);
           System.out.printf("%-25s%4.2f%n","paid price by customer:      $",paid);
        	   price=price*100;
        	 paid=paid*100;
        	
        	 System.out.printf("%-25s%4.2f%n","The change due:              $",(paid - price)/100);
             // variables
        	double change1 = (paid - price);
            double five=1;
            double one = 1;
            double quarter = 1;
            double dime= 1;
            double nickel = 1;
            double pennie = 1;
   
            if (five > 0)
            {
            	 five = change1 / 500;
                change1 = change1 % 500;
                System.out.printf("%-25s%6d%n" ,"Fives", (int)five );
            }
            if (one > 0) 
            {
            	 one = change1 / 100;
                change1 = change1 % 100;
                System.out.printf("%-25s%6d%n" ,"Ones", (int)one );
            }
            if (quarter > 0)
            {
            	quarter = change1 / 25;
                change1 = change1 % 25;
                System.out.printf("%-25s%6d%n" ,"Quarters", (int)quarter );
            }
            if (dime > 0) 
            {
            	 dime = change1 / 10;
                change1 = change1 % 10;
                System.out.printf("%-25s%6d%n" ,"Dimes", (int)dime );
            }
            if (nickel > 0)
            {
            	  nickel = change1 / 5;
                change1 = change1 % 5;
                System.out.printf("%-25s%6d%n" ,"nickles", (int)nickel);
            }
            if(pennie>0)
            {
            	  pennie = change1/1;
            	 change1 = change1 % 1;
            	 System.out.printf("%-25s%6d%n" ,"pennies", (int)pennie );
            }
        
            System.out.print("\nEnter the product price or (-22 to exit): $");
        price = keyboard.nextDouble();
	   } // closing while loop for  while(price!=-22)
       System.out.println("You exit the program! Good Bye");
       System.out.println("end the change counting program");
       System.out.println("........................................");
       
	} // main class loop ends

} // class loop ends
