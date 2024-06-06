import java.math.*;

public class RationalNumber extends SpecialNumber implements Comparable{
    
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
    public SpecialNumber add(SpecialNumber spec_num) throws Lab3Exception{

        if (!(spec_num instanceof RationalNumber)) {
            throw new Lab3Exception("Cannot add an incompatible type");
        }

        RationalNumber frac = (RationalNumber) spec_num;
        
        RationalNumber result = new RationalNumber();

        RationalNumber sumand1 = new RationalNumber(numerator, denominator);
        RationalNumber sumand2 = new RationalNumber(frac.numerator, frac.denominator);

        int lcd = findLCD(sumand1.denominator, sumand2.denominator);
        result.numerator = (sumand1.numerator * (lcd / sumand1.denominator) + sumand2.numerator * (lcd / sumand2.denominator));
        result.denominator = lcd;

        result.simplify();

        return result;
    }

    @Override
    public SpecialNumber divideByInt(int divisor) throws Lab3Exception{

        if (divisor == 0) {
            throw new Lab3Exception("Cannot divide by zero");
        }

        denominator = denominator * divisor;
        this.simplify();

        return this;
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

    @Override
    public int compareTo(Object obj) {

        RationalNumber frac = (RationalNumber) obj;
        double self_value = (double)numerator / (double)denominator;
        double frac_value = (double)frac.numerator / (double)frac.denominator;


        System.out.println(self_value + " " + frac_value);
        if (self_value == frac_value) {
            return 0;
        }
        else if (self_value > frac_value) {
            return 1;
        }
        
        return -1;

    }

    public static int findLCD(int x, int y) {

        for (int i = 2; i <= x * y; i++) {
            if ((i % x == 0 || x % i == 0) && (i % y == 0 || y % i == 0)) {
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
