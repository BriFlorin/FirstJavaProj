package lab1;

public class AppLab1 {
    public static void printMyName() {
        String exercise1 = "Ex. 1";
        System.out.println(exercise1);

        String greeting = "Hello";
        String name = "Bri Florin";
        System.out.println(greeting);
        System.out.println(name);
    }

    public static void sum() {
        String exercise2 = "Ex. 2";
        System.out.println(exercise2);
        int x = 20;
        int y = 40;
        int sum = x + y;
        System.out.println(sum);
    }

    public static void divide() {
        String exercise3 = "Ex. 3";
        System.out.println(exercise3);
        float a = 7;
        float b = 3;
        float division = a / b;
        System.out.println(division);
    }

    public static void calculate() {
        String exercise4a = "Ex. 4a";
        System.out.println(exercise4a);
        int c = -5;
        int d = 8;
        int e = 6;
        int op1 = c + d * e;
        System.out.println(op1);
    }

    public static void calculate2() {
        String exercise4b = "Ex. 4b";
        System.out.println(exercise4b);
        int f = 55;
        int g = 9;
        int op2 = (f + g) % g;
        System.out.println(op2);
    }
    public static void calculate3 (){
        String exercise4c = "Ex. 4c";
        System.out.println(exercise4c);
        int i = 20;
        int j = -3;
        int k = 5;
        int l = 8;
        float op3 = i + (float) j * k / l;
        System.out.println(op3);
    }
    public static void calculate4 (){
        String exercise4d = "Ex. 4d";
        System.out.println(exercise4d);
        float a = 5;
        float b = 15;
        float c = 3;
        float d = 2;
        float e = 8;
        float f = 3;
        float op4 = a + b / c * d - e % f;
        System.out.println(op4);
    }
    public static void main(String[] args) {
        printMyName();
        sum();
        divide();
        calculate();
        calculate2();
        calculate3();
        calculate4();

        String Exercising = "Exercising more";
        System.out.println(Exercising);

        int age = 27;
        System.out.println("age 27");

        double salaryRequirement = 5000;
        System.out.println("500000 Ron");

        boolean isEmployed = false;
        System.out.println("false");
    }
}

