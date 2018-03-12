
//==============================================================
//
// Title:      Nocturnal Nerds
// Course:     CSC 3020
// Homework:   3-2
// Author:     Dan Ouellette
// Date:       6 October 2016
// Description:
//   This Java application approximates PI.  It prompts for and
// gets from the user the number of terms to approximate PI to.
// It then uses the Leibniz formula to approximate PI:
//   4 * (1/1 – 1/3 + 1/5 – 1/7 + 1/9 – 1/11 + …)  It continues
// to prompt the user for the number of terms until -44 is 
// entered.
//
//==============================================================
package wsu.HW03_02;

// Import classes
import java.util.Scanner;

//==============================================================
// class HW03_02
//==============================================================
public class HW03_02
{
    
    //----------------------------------------------------------------
    // main
    //----------------------------------------------------------------
    public static void main (String[] args)
    {
    
        // Declare variables
        int terms;
        int denominator;
        double sum;
        Scanner keyboard = new Scanner(System.in);

        // Show application header
        System.out.println("Welcome to Nocturnal Nerds");
        System.out.println("--------------------------\n");

        // Prompt for and get number of terms
        System.out.print("Enter the number of terms to approximate " +
            "PI to (-44 to exit): ");
        terms = keyboard.nextInt();
        
        // Loop until sentinel value read
        while (terms != -44)
        {            

            // Loop to validate number of terms
            while (terms < 1 || terms>8)
            {
                System.out.println("Error: the number of terms " +
                    "must be >= 1.");
                System.out.print("Enter the number of terms to " +
                    "approximate PI to (-44 to exit): ");
                terms = keyboard.nextInt();
            }
            
            // Loop to approximate PI
            denominator = 1;
            sum = 0;
            for (int i = 1; i <= terms; i++)
            {
                if (i % 2 == 0)
                    sum = sum - 1. / denominator;
                else
                    sum = sum + 1. / denominator;
                denominator = denominator + 2;
            }
            sum = sum * 4;

            // Show inputs and calculations
            String colFmtS = "%-16s";
            String colFmtF = "%14.10f";
            String colFmtD = "%14d";
            System.out.println();
            System.out.printf(colFmtS + colFmtD + "%n", "Terms:",
                terms);
            System.out.printf(colFmtS + colFmtF + "%n", 
                "Approximate PI:", sum);

            // Prompt for and get number of terms
            System.out.print("\nEnter the number of terms to " +
                "approximate PI to (-44 to exit): ");
            terms = keyboard.nextInt();
            
        }
            
        // Close keyboard
        keyboard.close();

        // Show application close
        System.out.println("\nEnd of Nocturnal Nerds");

    } 

}

