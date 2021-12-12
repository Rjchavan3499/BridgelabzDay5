package day5;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers:");        

	     int x = sc.nextInt();              //taking input from user
	     int y = sc.nextInt();

	      System.out.println("before swaping:"                    //before swaping 
	                           + " x = " + x + ", y = " + y);
	      x = x + y;                                    //swaping operation
	      y = x - y;
	      x = x - y;
	     System.out.println("After swaping:"
	                           + " x = " + x + ", y = " + y);    //after swaping
	    
	}

}
