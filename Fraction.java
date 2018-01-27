/*************************************
Timothy McWatters
COP4331 - OO Programming
Programming Project 2

1 of 2 .java files
***Fraction.java
TestFraction.java

The objective of this project is to design 
a program to calculate operations on fractions.
*************************************/

/* 
SERIOUS ISSUES TO BE FIXXED!:
1) FRACTION NEEDS TO BE SAVED AS ITS OWN RESULT, NOT JUST OVERWRITING FRACTION1
2) IMPLEMENTING COMPARABLE INTERFACE
   -- COMPARETO METHOD OPERATORS
3) LOOK AT TOSTRING, IT WORKS BUT CAN BE BETTER
4) DEALING WITH 0 IN THE DEN 
5) DEALING WITH NEG FRACTIONS?
*/

/*************************************
class Fraction
   -Subclass to the Number super class. 
   -Implements the Comparable interface
   -Contains fields and methods to operate on 
	 fractions.
**************************************/
public class Fraction extends Number { // implements Comparable {
   private long num;
   private long den;
   private int other;
   
   /*************************************
   Fraction constructor
   constructor to set default case for class 
   Fraction instanced variables.
   **************************************/
   public Fraction() {
      this.num = 0;
      this.den = 1;
   }
   
   /*************************************
   Fraction constructor
   constructor to set input cases for class 
   Fraction instanced variables.
   **************************************/
   public Fraction(long num, long den) {
      this.num = num;
      this.den = den;
      if (this.den == 0) {
         System.out.println("INVALID FRACTION: Denominator can NOT be zero.");
      }
   }
   
   /*************************************
   getNum method
   returns the Numerator when called.
   **************************************/
   public long getNum() {
      return this.num;
   }
   
   /*************************************
   getDen method
   returns the Denominator when called.
   **************************************/
   public long getDen() {
      return this.den;
   }   
   
   /*************************************
   reducedFrac method
   Reduces the fraction to its lowest terms when called.
   **************************************/
   public void reducedFrac() {
      long tempGCD = gcd(num, den);
      num /= tempGCD;
      den /= tempGCD;
   }
   
   /*************************************
   add method
   Returns the addition of the calling fraction (this)
   with another (secondFraction) when called.
   **************************************/
   public Fraction add(Fraction secondFraction) {
      num = (this.num * secondFraction.den) + (secondFraction.num * this.den);
      den = this.den * secondFraction.den;     
      this.reducedFrac();
      return this;
   }
   
   /*************************************
   subtract method
   Returns the subtraction of the calling fraction (this)
   from another (secondFraction) when called.
   **************************************/
   public Fraction subtract(Fraction secondFraction) {
      num = (this.num * secondFraction.den) - (secondFraction.num * this.den);
      den = this.den * secondFraction.den;     
      this.reducedFrac();
      return this;
   }

   /*************************************
   multiply method
   Returns the product of the calling fraction (this)
   with another (secondFraction) when called.
   **************************************/
   public Fraction multiply(Fraction secondFraction) {
      num = (this.num * secondFraction.num);
      den = this.den * secondFraction.den;
      this.reducedFrac();
      return this;
   }
   
   /*************************************
   divide method
   Returns the division of the calling fraction (this)
   from another (secondFraction) when called.
   **************************************/
   public Fraction divide(Fraction secondFraction) {
      num = (this.num * secondFraction.den);
      den = this.den * secondFraction.num;
      this.reducedFrac();
      return this;
   }
   
   /*************************************
   toString method (overrides the super class's toString)
   Returns a string representation of the object.
   **************************************/   
	@Override
   public String toString() {
      if (den == 1) {
		   return (num + ""); // <----WHAT THE HELL?
	   }
		else return (num + "/" + den);
   }
   
   /*************************************
   equals method (overrides the super class's equal)
   Returns a boolean if the calling equals the passed fraction.
   **************************************/ 
   @Override
   public boolean equals(Object frac) {
		if ((this.num == ((Fraction)frac).num) && (this.den == ((Fraction)frac).den)) {
		   return true;
		}
		else {
         return false;
      }
   }
   
   /*************************************
   doubleValue method (overrides the super class's doubleValue)
   Returns the double value of the calling fraction.
   **************************************/ 
   @Override
   public double doubleValue() {
      return (this.num / (double)this.den);
   }
   
   /*************************************
   intValue method (overrides the super class's intValue)
   Returns the int value of the calling fraction.
   **************************************/
   @Override
   public int intValue() {
      return ((int)this.num / (int)this.den);
   }
   
   /*************************************
   longValue method (overrides the super class's longValue)
   Returns the long value of the calling fraction.
   **************************************/
   @Override
   public long longValue() {
      return (this.num / (long)this.den);
   }
   
   /*************************************
   floatValue method (overrides the super class's floatValue)
   Returns the float value of the calling fraction.
   **************************************/
   @Override
   public float floatValue() {
      return (this.num / (float)this.den);
   }
   
   /*************************************
   gcd method takes 2 longs, and returns the 
   long value of the greatest common denominator.
   **************************************/
   private long gcd(long p, long q) {
        p = Math.abs(p);
        q = Math.abs(q);
        
        if (q == 0) {
           return p;
        }
        else return gcd(q, p % q);
    }
    
   /*************************************
   compareTo method (Required due to Comparable Interface)
   Returns the -1 if calling object is less, 0 if equal, or
   1 if greater than.
   **************************************/         
   /*@Override// FIX ME!!!!!!!!!!!!!!!!!!!
   public int compareTo(Object frac) {
      if (this == frac) {
         return 0;
      }
      else  if (this < frac) {
         return 0;
      }
       else if (this > frac) {
         return 0;
      }
   }
   */
   
}
