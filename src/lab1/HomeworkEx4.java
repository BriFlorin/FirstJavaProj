package lab1;

public class HomeworkEx4 {
    public static float calculateMean(int nr1, int nr2, int nr3){
        int sum = nr1+nr2+nr3;
        float mean = sum/3;
        return mean;
    }
    public static void main(String[] args) {
        float result = calculateMean(18,15,88);
        float result2 = calculateMean(7,8,9);
        System.out.println(result2);
        System.out.println(result);
    }

}
