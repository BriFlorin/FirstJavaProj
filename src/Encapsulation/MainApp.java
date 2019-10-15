package Encapsulation;

public class MainApp {
    public static void main(String[] args) {
        Adoptator ad1 = new Adoptator("Marius", 50);
        System.out.println(ad1.getName()+" "+ad1.getAvailableSum());

        Food f1 = new Food("Purina", 45,22, false);
        System.out.println(f1.getName()+" "+f1.getPrice()+" "+f1.getAvailability()+" "+f1.getQuantity() );

        Food p1 = new Food("p1", 20, 55, false );
        System.out.println(p1.getName()+" "+p1.getPrice());

        Vet v1= new Vet("Ionel", " ProfiVet");
        System.out.println(v1.getName()+" "+v1.getWorkDomain());

        RelaxMode rm = new RelaxMode("Sleeping");
        System.out.println(rm.getName());

        Animal a1 = new Animal("Ariel",15, 8,7,6,f1,rm);
        System.out.println(a1.getName()+" "+a1.getAge()+" "+ a1.getHealthLevel()+" "+a1.getHungerLevel()+" "+a1.getMoodLevel()+ " "+a1.getFavoriteFood().getName());

    }

}
