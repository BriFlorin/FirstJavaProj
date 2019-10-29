package LabForLoops;


import Lab3.Calculator.LogicalOp;

public class Main {
    public static void main(String[] args) {
        LogicalOperator op1 = new LogicalOperator();
        op1.printNumbers(8);

        LogicalOperator op2 = new LogicalOperator();
        op2.printNumbers2(2);

        op2.printRange(5, 500);

        op1.biggerNumber(15, 5);

        op1.printEvenNumbers();

        op1.printOddNumbers();

        System.out.println(op1.sumNumbers(50));


        System.out.println(op1.average(50));

        op1.printPattern();


    }
}
