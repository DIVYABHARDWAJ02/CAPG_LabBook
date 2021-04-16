
package lab1;
import java.util.Arrays;
import java.util.Scanner;

public class Excercise1 {
	
	public static void main(String args[]){
	    int input;

	    System.out.println("Enter a Number");
	    Scanner sc = new Scanner(System.in);
	   input = sc.nextInt();

	    int number = input; 
	    int counter = 0; 
	    int s=0;
	    int c=0;

	    while(number>0){
	        int t= number%10;
	       c=t*t*t;
	        System.out.println("Cube of "+t +" is "+c);
	        s = s+c;
	        
	        counter = counter+1;
	        number = number/10;
	        }
        System.out.println("sum =  "+ s);


	}
	}

