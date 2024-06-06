
class Main {

    public static void main(String args[]) throws Lab3Exception{
    
        RationalNumber n1 = new RationalNumber();
        RationalNumber n2 = new RationalNumber(1, 2);
        RationalNumber n3 = new RationalNumber(4, 2);
        RationalNumber n4 = new RationalNumber(2, 4);
        RationalNumber n5 = new RationalNumber(100, 50);

        n2.simplify();
        n3.simplify();
        n4.simplify();
        n5.simplify();
        
        System.out.println(n2 + " " + n3 + " " + n4 + " " + n5);

        System.out.println(RationalNumber.findLCD(3, 4));

        System.out.println(new RationalNumber(3, 4).add(new RationalNumber(2, 3)));
        
        System.out.println(new RationalNumber(1, 2).divideByInt(2));
        System.out.println(new RationalNumber(3, 4).divideByInt(3));
    }

}