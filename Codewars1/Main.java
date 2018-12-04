/* Instructions:
Write a function, persistence, that takes in a positive 
parameter num and returns its multiplicative persistence, 
which is the number of times you must multiply the 
digits in num until you reach a single digit.
For example:
 persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
                      // and 4 has only one digit
 persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
                       // 1*2*6 = 12, and finally 1*2 = 2
 persistence(4) == 0 // because 4 is already a one-digit number
*/
package Codewars1;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	System.out.println ("Input the incoming number here, please: ");
	Scanner scr = new Scanner(System.in);
	long n = scr.nextLong();             // inputing n
	int counter = 0;
    long multi = 1;
    String str = "";
    while (n > 9) {
      str = String.valueOf(n);
      long [] massiv = new long [str.length()];
        for (int i = 0; i< str.length(); i++) {
          massiv[i] = Character.getNumericValue(str.charAt(i));
          multi = multi * massiv[i];
        }
        str = "";
        massiv = null;
        n = multi;
        multi = 1;
        counter++;
    }
    System.out.println ("So, my friend, it takes " + counter + " iterations to get 1-digit number."); // it was return
}
}
