package lab1;

public class HomeworkEx9 {
    public static float getSpeedInMs(float distance, int hour, int minutes, int seconds) {
        float calulateseconds = seconds + minutes * 60 + hour * 60 * 60;
        float calculateSpeed = (float) distance / calulateseconds;
        return calculateSpeed;
    }

    public static void main(String[] args) {
        float result = getSpeedInMs(50, 0, 2, 5);
        String name = " m/s";
        System.out.print(result);
        System.out.println(name);
        float result1 = getSpeedInKmH(1200, 1, 40, 22 );
        System.out.println(result1);

    }

    public static float getSpeedInKmH(float metres, int hour, int minutes, int seconds) {
        float km = (float) metres / 1000;
        float calculateHours = hour + (float) minutes / 60 + (float) seconds / 60 / 60;
        float calculateSpeed = km/calculateHours;
        return calculateSpeed;

    }


}
