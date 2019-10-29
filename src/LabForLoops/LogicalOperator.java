package LabForLoops;

public class LogicalOperator {
    public void printNumbers(int n) {
        for (int i = n; i < 100; i++) {
            System.out.println(i);
        }
    }

    public void printNumbers2(int n) {
        for (int i = n; i > -100; i--) {
            System.out.println(i);
        }
    }

    public void printRange(int n, int m) {
        for (int i = n; i < m; i++) {
            System.out.println(i);
        }
    }

    public void biggerNumber(int x, int y) {
        if (x < y) {
            for (int i = x; i < y; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = y; i < x; i++) {
                System.out.println(i);
            }

        }
    }

    public void printEvenNumbers() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void printOddNumbers() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public int sumNumbers(int n) {
        int s = 0;
        for (int i = n; i < 100; i++) {
            s = s + i;
        }
        return s;
    }

    public float average(int n) {
        int sum = 0;
        int numbers = 0;
        for (int i = n; i < 100; i++) {
            sum = sum + i;
            numbers = numbers + 1;
        }
        float av = sum / numbers;
        return av;
    }

    public void printPattern() {
        for (int i = 7; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
