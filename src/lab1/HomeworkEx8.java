package lab1;

public class HomeworkEx8 {
    public static float convertInchToM(float inch) {
        float m = inch / 39.370f;
        return m;
    }

    public static void main(String[] args) {
        float result = convertInchToM(70);
    System.out.println(result);

    }

}
