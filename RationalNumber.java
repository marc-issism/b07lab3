public class RationalNumber extends SpecialNumber{
    
    int numerator;
    int denominator;

    // Empty constructor fraction = 1/1
    public RationalNumber() {
        numerator = 1;
        denominator = 1;
    }

    // Constructor that takes in 2 integers
    public RationalNumber(int numerator, int denominator) throws Lab3Exception{

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
            SpecialNumber spec_num = (SpecialNumber) object;
        }

        // Implement comparison code

        return false;


    }

    @Override
    public int hashCode() {

        // Implement hashCode

        return  0;
    }

}
