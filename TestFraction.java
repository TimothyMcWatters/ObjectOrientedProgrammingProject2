/*************************************
Timothy McWatters
COP4331 - OO Programming
Programming Project 2

2 of 2 .java files
Fraction.java
***TestFraction.java

The objective of this project is to design 
a program to calculate operations on fractions.
*************************************/

/*************************************
class TestFraction
   The test class for the Fraction class. This class is designed 
   for a specific output as outlined in project 2's
   directions.
**************************************/
public class TestFraction {

   public static void main(String[] args) {
      String frac1 = "";
      String frac2 = "";
      boolean isEqual = false;
      long num1 = 20;
      long num2 = 40;
      
      Fraction fraction1 = new Fraction(2, 1); // Creates a new instance of Fraction
      Fraction fraction2 = new Fraction(2, 3); // Creates a new instance of Fraction
      
      // Tests the Fraction class for operations add, subtract, multiply and divide. 
      // DELETE AFTER TROUBLESHOOTING THE OVERWRITING OF FRACTION1
      System.out.println(fraction1);
      System.out.println(fraction2);
      System.out.println(fraction1.add(fraction2));
      
      System.out.println();
      System.out.println(fraction1);
      System.out.println(fraction2);
      System.out.println(fraction1.subtract(fraction2));
      
      System.out.println();
      System.out.println(fraction1);
      System.out.println(fraction2);
      System.out.println(fraction1.multiply(fraction2));
      
      System.out.println();
      System.out.println(fraction1);
      System.out.println(fraction2);
      System.out.println(fraction1.divide(fraction2));
     
      // Sample output for the project
      System.out.println();
      System.out.println((fraction1.toString()) + " + " + (fraction2.toString()) + " = " + (fraction1.add(fraction2)));
      System.out.println((fraction1.toString()) + " - " + (fraction2.toString()) + " = " + (fraction1.subtract(fraction2)));
      System.out.println((fraction1.toString()) + " * " + (fraction2.toString()) + " = " + (fraction1.multiply(fraction2)));
      System.out.println((fraction1.toString()) + " / " + (fraction2.toString()) + " = " + (fraction1.divide(fraction2)));
      System.out.println();
      
      System.out.println((fraction1.toString()) + " is " + fraction1.doubleValue() + " as a double.");
      System.out.println((fraction2.toString()) + " is " + fraction2.doubleValue() + " as a double.");
      System.out.println();
      System.out.println((fraction1.toString()) + " is " + fraction1.intValue() + " as an int.");
      System.out.println((fraction2.toString()) + " is " + fraction2.intValue() + " as an int.");
      System.out.println();
      System.out.println((fraction1.toString()) + " is " + fraction1.longValue() + " as a long.");
      System.out.println((fraction2.toString()) + " is " + fraction2.longValue() + " as a long.");
      System.out.println();
      System.out.println((fraction1.toString()) + " is " + fraction1.floatValue() + " as a float.");
      System.out.println((fraction2.toString()) + " is " + fraction2.floatValue() + " as a float.");
            
      } 
}
