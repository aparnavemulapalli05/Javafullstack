package mypackage;
import java.util.Scanner;
public class Naturalnumbers {
 
    public static void main(String[] args) {
 
        int num = 10, i = 1, sum = 0; // declaring variables
       System.out.println("Please enter the value of n:");
       Scanner scan = new Scanner(System.in);
       num = scan.nextInt(); // taking value from user..
 
        while(i <= num) // adding N natural values..
        {
            sum += i;
            i++;
        }
        // Printing sum or N natural Number.
        System.out.println("Sum = " + sum);
    }
}