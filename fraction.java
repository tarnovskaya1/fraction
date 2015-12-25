package fraction;
public class fraction {
public int d, n;

public fraction(int delimeter, int numerable){
d = delimeter;
n = numerable;
}

public  tostring(){

        return n + "/" + d;

    }
    public static boolean equals(Fraction first, Fraction second){

        // Cashing variables

        int numFirst = first.n;
        int numSecond = second.n;


        // Mutual for Fractions

        int mutual = getMutual(first, second);

        int multyplierFirst = getMultyplierForNum(first.d, mutual);
        int multyplierSecond = getMultyplierForNum(second.d, mutual);

        // compare

        return numFirst * multyplierFirst == numSecond * multyplierSecond;


    }


    /*
    *
    * Two fractions division
    *
    * return @Fraction
    *
    * */

    public static Fraction division(Fraction first, Fraction second){

        int dividedDel;
        int dividedNum;

        dividedNum = first.n * second.d;
        dividedDel = first.d * second.n;

        return new Fraction(dividedNum, dividedDel);
    }
    /*
    *
    * Params: Fractions objects
    *
    * return @Fraction
    *
    * */
    public static Fraction multiply(Fraction first, Fraction second){

        int multipliedDel;
        int multipliedNum;

        multipliedNum = first.n * second.n;
        multipliedDel = first.d * second.d;

        return new Fraction(multipliedNum, multipliedDel);
    }

    /*
    * params delimiters
    *
    * return @int
    *
    * */
    private static int getMutual(Fraction first, Fraction second){
        return first.d * second.d;
    }


    /*
    *
    * Multyplier getter for Numerable
    *
    * */
    private static int getMultyplierForNum(int delimeter, int mutual){

        return mutual / delimeter;

    }

}