package day5;
import java.util.*;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // reads the command-line argument
		int a=Integer.parseInt(args[1]);//"10" convert to 10 and it will store in a
		   
        int i = 0;                // count from 0 to n
        int powerOfTwo = 1;       // the ith power of 2

        // repeat until i equals n
        while (i <= a) {
            System.out.println(i + " " + powerOfTwo);   // print the power of 2
            powerOfTwo = 2 * powerOfTwo;                // double to get the next one
            i = i + 1;
        }
	}

}
