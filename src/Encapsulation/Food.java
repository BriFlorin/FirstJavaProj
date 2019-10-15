package Encapsulation;

public class Food {
    private String name = "Wiskas";
    private int price = 25;
    private int quantity = 10;
    private boolean availability = true;

    public Food(String name1, int price, int quantity, boolean av) {
        this.name = name1;
        this.price = price;
        this.quantity = quantity;
        this.availability = av;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean getAvailability() {
        return availability;
    }
}
