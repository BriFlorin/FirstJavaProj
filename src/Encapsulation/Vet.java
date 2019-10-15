package Encapsulation;

public class Vet {
    private String name;
    private String workDomain;

    public Vet(String name, String work ){
        this.name= name;
        this.workDomain= work;
    }

    public String getName() {
        return name;
    }

    public String getWorkDomain() {
        return workDomain;
    }
}
