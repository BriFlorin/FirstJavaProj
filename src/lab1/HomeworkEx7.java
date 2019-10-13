package lab1;

public class HomeworkEx7 {
    public static float convertToCelsius(float gradeFahrenheit) {
        float result = (float)5/9 * (gradeFahrenheit - 32);
        return result;
    }

    public static void main(String[] args) {
        float a = convertToCelsius(2);
        System.out.println(a);

    }

}
