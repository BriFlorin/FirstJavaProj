package lab2.AnimalRescue;

public class Animal {

    String name = "Jhonsnow";
    float age = 10.5f;
    int healthLevel = 8;
    int hungerLevel = 5;
    int moodLevel = 7;
    Food favoriteFood;
    RelaxMode favoriteRelaxMode;

    public Animal(String name1, float age1, int health, int hunger, int mood, Food food, RelaxMode relax) {
        this.name = name1;
        this.age = age1;
        this.healthLevel = health;
        this.hungerLevel = hunger;
        this.moodLevel = mood;
        this.favoriteFood = food;
        this.favoriteRelaxMode = relax;
    }

}