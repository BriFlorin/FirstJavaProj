package lab1;

public class HomeworkMethodsEx2 {

    public static int sum(int nr1, int nr2){
        int sum = nr1+nr2;
        return sum;
    }

    public static float divide(float nr1, float nr2){
        float division = nr1/nr2;
        return division;
    }

    public static void main(String[] args) {
        int result= sum(22,44);
        int result2= sum(798,54);

        float division = divide(12,4);
        System.out.println(division);

        int difference = calculateDifference(854,455);
        System.out.println(difference);

        int multiply = multiply(785,999);
        System.out.println(multiply);

        System.out.println(result);
        System.out.println(result2);
    }
    public static int calculateDifference (int nr1, int nr2){
        int difference = nr1-nr2;
        return difference;

    }

    public static int multiply (int nr1, int nr2){
        int multuply = nr1*nr2;
        return multuply;
    }
}
