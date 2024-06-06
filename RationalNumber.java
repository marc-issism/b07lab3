import java.math.*;

public class RationalNumber extends SpecialNumber{
    
    int numerator;
    int denominator;

    // Empty constructor fraction = 1/1
    public RationalNumber() {
        super();
        
        numerator = 1;
        denominator = 1;
    }

    // Constructor that takes in 2 integers
    public RationalNumber(int numerator, int denominator) throws Lab3Exception{
        super();

        if (denominator == 0) {
            throw new Lab3Exception("Cannot divide by zero");
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public SpecialNumber add(SpecialNumber spec_num) {

        // implement add

        return null;
    }

    @Override
    public SpecialNumber divideByInt(int divisor) {

        //implement divisor

        return null;
    }

    // Implement Comparable

    @Override
    public boolean equals(Object object) {

        if (object == null) {
            return false;
        }

        if (object instanceof SpecialNumber) {
            RationalNumber spec_num = (RationalNumber) object;
            
            if (numerator == spec_num.numerator && denominator == spec_num.denominator) {
                return true;
            }
            if (((double)numerator/(double)denominator) == ((double)spec_num.numerator/(double)spec_num.denominator)) {
                return true;
            }

        }

        return false;
    }

    @Override
    public int hashCode() {

        // Implement hashCode

        return (int) (numerator * Math.PI + denominator * Math.PI);
    }

    @Override 
    public String toString() {
        return numerator + "/" + denominator;
    }

    public static int findLCD(int x, int y) {

        for (int i = 2; i <= x * y; i++) {
            if ((i % x == 0) && (i % y == 0)) {
                return i;
            }
        }

        return 1;
    }

    public void simplify() {
        if (numerator == 1 || denominator == 1) {
            return;
        }
        else if (numerator % denominator == 0 || denominator % numerator == 0) {
            //System.out.print(this + " simplifiable to ");
            if (numerator < denominator) {

                int new_numerator = numerator / numerator;
                int new_denominator = denominator / numerator;
                numerator = new_numerator;
                denominator = new_denominator;
                //System.out.println(numerator + "/" + denominator);
            }
            else {
                int new_numerator = numerator / denominator;
                int new_denominator = denominator / denominator;
                numerator = new_numerator;
                denominator = new_denominator;
                //System.out.println(numerator + "/" + denominator);
            }
        }
   
    }

}
