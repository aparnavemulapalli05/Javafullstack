package mypackage;

import java.util.Scanner;
public class Factor 
{
 
  public static void main(String[] args) 
  {
    // Declaring vriables..
    int num ,i ;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a number:: ");
    num = s.nextInt(); // takin value from user
    System.out.print("Factors of " + num + " are: ");
 
    // loop run till number..
    for (i = 1; i <= num; ++i) 
    {
      if (num % i == 0)  // finding factor
      {
      System.out.print(i + " "); // Printing fators
      }
    }
  }
}