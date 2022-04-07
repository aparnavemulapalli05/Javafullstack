package mypackage;
import java.util.Scanner;
public class Prime {
 
  public static void main(String[] args) 
  {
 
    int number, i = 2; // Declaring variables
    boolean Count = false;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter any number ");
    number = s.nextInt(); // taking value form user..
    
    while (i <= number / 2)  // Checking condition for Prime
    {
      // condition for Prime number
      if (number % i == 0) {
        Count = true;
        break;
      }
 
      ++i;
    }
 
    if (!Count) // Printing Prime  or not
      System.out.println(number + " is a prime number.");
    else
      System.out.println(number + " is not a prime number.");
  }
}