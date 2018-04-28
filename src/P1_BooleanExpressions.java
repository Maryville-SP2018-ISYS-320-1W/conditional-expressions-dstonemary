/*
  	ISYS 320
  	Name(s): Derek Stone
  	Date:    April-27-2018
*/

/*
 Your expression predictions:
 
 1. true
 2. true
 3. false
 4. true
 
 5. true
 6. false
 7. true
 8. true
   
 */

/*
 Were you correct? Explain if you were not (what did you learn?)
 
 1. true
 2. true
 3. false
 4. true
 
 5. true
 6. false
 7. true
 8. true
All were correct
I learned about the output of combination of true and false with operator && (and) and || (or).
Expression with && operator result will be true if both operands are true other than that result will get false.
Expression with || operator result will be false if both operands are false other than that result will get true.

 */
public class P1_BooleanExpressions {

	public static void main(String[] args) {
		int x = 27; 
		int y = -1; 
		int z = 32; 
		boolean b = false; 
		
		System.out.println(!b);
		System.out.println(b || true);
		System.out.println((x > y) && (y > z) );
		System.out.println((x == y) || (x <= z));
		System.out.println(!(x % 2 == 0)); 
		System.out.println(b && !b);
		System.out.println(b || !b);
		System.out.println((x < y) == b);
	}

}
