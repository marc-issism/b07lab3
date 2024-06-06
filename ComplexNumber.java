import java.math.*;

public class ComplexNumber extends SpecialNumber implements Comparable {
    
    double real;
    double imaginary;
    double magnitude;

    // Constructor that takes in 2 doubles
    public ComplexNumber(double real, double imaginary) {
        super();

        this.real = real;
        this.imaginary = real;

        magnitude = Math.sqrt(((real * real) + (imaginary *imaginary)));
    }

    @Override
    public SpecialNumber add(SpecialNumber spec_num) throws Lab3Exception {

        if (!(spec_num instanceof ComplexNumber)) {
            throw new Lab3Exception("Cannot add an incompatible type");
        }

        ComplexNumber comp = (ComplexNumber) spec_num;

        return new ComplexNumber(real + comp.real, imaginary + comp.imaginary);

    }

    @Override
    public SpecialNumber divideByInt(int divisor) throws Lab3Exception {

        if (divisor == 0) {
            throw new Lab3Exception("Cannot divide by zero");
        }

        return new ComplexNumber(real / (double)divisor, imaginary/ (double) divisor);

    }

    @Override
    public int compareTo(Object obj) {

        ComplexNumber comp = (ComplexNumber) obj;

        if (magnitude == comp.magnitude) {
            return 0;
        }
        else if (magnitude > comp.magnitude) {
            return 1;
        }

        return -1;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof ComplexNumber)) {
            return false;
        }

        ComplexNumber comp = (ComplexNumber) obj;

        if (real == comp.real && imaginary == comp.imaginary) {
            return true;
        }

        return false;

    }

    @Override
    public int hashCode() {
        return (int) (magnitude * Math.E + real);
    }

}
