/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swaping;
import java.util.Scanner;
/**
 *
 * @author Zion
 */
public class Swaping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int lastDigit = 0, firstDigit = 0;
    System.out.println("Please enter the number:");
    Scanner scanner = new Scanner(System.in);
    // we are getting the user input.
    int number = scanner.nextInt();

    // getting the last digit from the number.
    lastDigit = number%10;
    int power = (int) Math.log10(number);

    // Getting the first digit from the number.
    firstDigit = (int) (number / Math.pow(10, power));

    int a = firstDigit * (int) Math.pow(10, power);
    int b = number %a;
    number = b/10;

    number = (lastDigit * (int)Math.pow(10, power)) + number* 10 + firstDigit;
    System.out.println("The result: " + number);

       
    }

   
    }
    

