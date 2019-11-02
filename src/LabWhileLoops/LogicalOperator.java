package LabWhileLoops;

public class LogicalOperator {
    public void printNumbersTo100(int n) {
        while (n <= 100) {
            System.out.println(n);
            n++;
        }

    }

    public void printNegativeNumbers(int n) {
        while (n >= -100) {
            System.out.println(n);
            n--;
        }
    }

    public void printRange(int x, int y) {
        while (x <= y) {
            System.out.println(x);
            x++;
        }
    }

    public void printOrderRange(int a, int b) {
        if (a < b) {
            this.printRange(a, b);
        } else {
            this.printRange(b, a);
        }
    }

    public void printEvenNumbers() {
        int x = 1;
        while (x <= 100) {
            if (x % 2 == 0)
                System.out.println(x);
            x++;
        }
    }

    public void printOddnumbers() {
        int y = 1;
        while (y <= 100) {
            if (y % 2 != 0)
                System.out.println(y);
            y++;
        }
    }

    public void printSum() {
        int a = 111;
        int b = 8899;
        int sum = 0;
        int count = 0;
        while (a <= b) {
            sum = sum + a;
            count = count + 1;
            a++;

        }
        System.out.println(sum);
        System.out.println(sum / count);
    }

    public void printAverage(int a, int b) {
        int sum = 0;
        int count = 0;
        while (a <= b) {
            if (a % 7 == 0) {
                sum = sum + a;
                count = count + 1;

            }
            a++;
        }
        System.out.println(sum / count);
    }

    public void printFibonacci() {
        int nr1 = 0;
        int nr2 = 1;
        int nr3;
        System.out.print(nr1 + " " + nr2 + " ");
        int i = 1;
        while (i <= 20) {
            nr3 = nr1 + nr2;
            nr1 = nr2;
            nr2 = nr3;
            i++;
            System.out.print(nr3 + " ");
        }
    }

    public void CozaLozaWoza() {
        int i = 1;
        while (i<=100){
            if (i%3 ==0){
                System.out.print("Coza ");
            }
            else if(i%5==0){
                System.out.print("Loza ");
            }
            else if (i%7==0){
                System.out.print("Woza ");
            }
            else if (i%3==0 && i%5==0){
                System.out.print("Coza Loza ");
            }
            else if (i%3==0 && i%7==0){
                System.out.print("Coza Woza ");
            }
            else if (i%5==0 && i%7==0){
                System.out.print("Woza Loza ");
            }
            else if ( i%3==0 && i%5==0 && i%7==0){
                System.out.print("Coza Woza Loza ");
            }
            else {
                System.out.print(i+ " ");
            }
            i++;
        }
    }
}
