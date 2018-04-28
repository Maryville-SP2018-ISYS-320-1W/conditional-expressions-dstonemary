/*
  	ISYS 320
  	Name(s): Derek Stone
  	Date:    April-27-2018
*/

import java.util.Scanner;

public class P3_Consecutive {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("This program calculates if three input values are consecutive.");
		
		String doItAgainResponse = "";
		
		do {
			System.out.print("Enter value 1: ");
			int num1 = console.nextInt();
			System.out.print("Enter value 2: ");
			int num2 = console.nextInt();
			System.out.print("Enter value 3: ");
			int num3 = console.nextInt();
			if(areConsecutiveNumbers(num1, num2, num3))			
				System.out.printf( "a: %d, b: %d, c: %d -> They are consecutive.", num1, num2, num3);
			else
				System.out.printf( "a: %d, b: %d, c: %d -> They are not consecutive.", num1, num2, num3);
			
			System.out.print("\nWould you like to do it again (enter 'n' to quit)? ");
			doItAgainResponse = console.next();
		} while( !doItAgainResponse.equalsIgnoreCase("n"));
		
		System.out.println("Thanks!");
	}
	
	public static boolean areConsecutiveNumbers(int num1, int num2, int num3){
		boolean isConsecutive = false;
		if((num1 + num2 + num3) == 0){
			if((num1 == 0 || num2 == 0 || num3 ==0) && (num1 == 1 || num2 == 1 || num3 ==1)){
				isConsecutive = true;
			}
		} else {
			int total = (num1 + num2 + num3);
			int avg = total / 3;
			if((avg == num1 && Math.abs(num1-num2) == 1 &&  Math.abs(num1-num3) == 1) ||
					(avg == num2 && Math.abs(num2-num1) == 1 &&  Math.abs(num2-num3) == 1) ||
						(avg == num3 && Math.abs(num3-num2) == 1 &&  Math.abs(num3-num2) == 1)){
				isConsecutive = true;
			}
		}
		return isConsecutive;
	}

}
