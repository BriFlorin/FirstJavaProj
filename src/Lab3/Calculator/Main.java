package Lab3.Calculator;

public class Main {
    public static void main(String[] args) {

        LogicalOp op = new LogicalOp();

        int biggest = op.checkBiggerNumber(2,3);

        System.out.println("The bigger number is: " + biggest);
        Calculator c = new Calculator();

        System.out.println( c.divide(12,22));

        int x = c.multiply(44,33);
        System.out.println(x);
        System.out.println(c.sum(66,34));
        System.out.println(c.calculateDifference(23,34));

        System.out.println(op.compare("Abc"));
        System.out.println(op.compare("FastTrackIt"));

        System.out.println(op.compareTextandNumber("Blabla",5));

        System.out.println(op.checkAmountOfSnow(5));
        System.out.println(op.comparNumber(55));
    }



}
