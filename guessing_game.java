/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessing_game;
//by importing random from util
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Zion
 */
public class guessing_game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int maxAttempt=3;
int attempt=1;
Random random = new Random();
int rand = 0;
while (true){
    rand = random.nextInt(16);
    if(rand !=0) break;
}

int guess;

Scanner x=new Scanner(System.in);

do{
    System.out.println("Guess the number");
     guess=x.nextInt();
if(guess<rand){
System.out.println("the number is too LOW");

}
else if(guess>rand){
    System.out.println("the number is too High");
}
else
    System.out.println("you got it");
} while(guess !=rand && attempt++<maxAttempt);
 
   System.out.println("the correct number is "+ rand); 
    
    }

}
