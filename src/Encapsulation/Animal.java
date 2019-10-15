package Encapsulation;

public class Animal {

    private String name = "Jhonsnow";
    private float age = 10.5f;
    private int healthLevel = 8;
    private int hungerLevel = 5;
    private int moodLevel = 7;
    private Food favoriteFood;
    private RelaxMode favoriteRelaxMode;

    public Animal(String name1, float age1, int health, int hunger, int mood, Food food, RelaxMode relax) {
        this.name = name1;
        this.age = age1;
        this.healthLevel = health;
        this.hungerLevel = hunger;
        this.moodLevel = mood;
        this.favoriteFood = food;
        this.favoriteRelaxMode = relax;
    }

    public String getName() {
        return name;
    }

    public float getAge() {
        return age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public Food getFavoriteFood() {
        return favoriteFood;
    }

    public RelaxMode getFavoriteRelaxMode() {
        return favoriteRelaxMode;
    }
}