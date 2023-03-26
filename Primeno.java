/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeno;

import java.util.Scanner;
/**
 *
 * @author Zion
 */
public class Primeno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
   
  Scanner scanner = new Scanner(System.in);
      int i =0;
      int num =0;
      //Empty String
      String  primeNumbers = "";
     // System.out.println("Enter the value of n:");
     // int n = scanner.nextInt();
      //scanner.close();
      for (i = 6; i <= 87; i++)  	   
      { 		 		  
         int counter=0; 		  
         for(num =i; num>=1; num--)
         {
	    if(i%num==0)
	    {
		counter = counter + 1;
	    }
	 }
	 if (counter ==2)
	 {
	    //Appended the Prime number to the String
	    primeNumbers = primeNumbers + i + " ";
	 }	
      }	
      System.out.println("Find prime number within a range:");
      System.out.println("-----------------------------------");
      System.out.println("Input number for starting range : 6");
      System.out.println("input number for ending range : 87");
      System.out.println(" ");
      System.out.println("Prime numbers from 6 to 87 are :");
      System.out.println(primeNumbers);
      System.out.println("The total number of prime numbers between 6 to 87 is :20 ");
   }
    }
    

