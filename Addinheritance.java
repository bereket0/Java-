/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package addinheritance;
import java.util.Scanner;
public class Addinheritance {
	
	int a;
	int b;
	int result;
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	public void showResult()
	{
		System.out.println("Addition of two numbers = "+result);
	}
          public static void main(String[] args) {
        // TODO code application logic here
        Scanner a= new Scanner(System.in);
	Scanner z =new Scanner(System.in);
        System.out.println("enter number");
        int x=z.nextInt();
        System.out.println("enter second number");
        int y=a.nextInt();
		ClassB b = new ClassB();
		b.setValue(x, y);
		b.add();
		b.showResult();
	
    }
}
 class ClassB extends Addinheritance {

	public void add()
	{
		result = a+b;
	}
}


