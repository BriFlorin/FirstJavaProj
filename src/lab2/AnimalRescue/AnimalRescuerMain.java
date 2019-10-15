package lab2.AnimalRescue;

public class AnimalRescuerMain {
    public static void main(String[] args) {
        Adoptator ad1 = new Adoptator("Marius", 50);
        System.out.println(ad1.name+" "+ad1.availableSum);

        Food f1 = new Food("Purina", 45,22, false);
        System.out.println(f1.name+" "+f1.price+" "+f1.availability+" "+f1.quantity );

        Food p1 = new Food("p1", 20, 55, false );
        System.out.println(p1.name+" "+p1.price);

        Vet v1= new Vet("Ionel", " ProfiVet");
        System.out.println(v1.name+" "+v1.workDomain);

        RelaxMode rm = new RelaxMode("Sleeping");
        System.out.println(rm.name);

        Animal a1 = new Animal("Ariel",15, 8,7,6,f1,rm);
        System.out.println(a1.name+" "+a1.age+" "+ a1.healthLevel+" "+a1.hungerLevel+" "+a1.moodLevel+ " "+a1.favoriteFood.name);

    }

}
