package Encapsulation;

public class Adoptator {
    private String name = "Ion";
    private int availableSum = 500;

    public Adoptator(String n, int sum) {
        this.name = n;
        this.availableSum = sum;
    }

    public String getName() {
        return name;
    }

    public int getAvailableSum() {
        return availableSum;
    }
}
