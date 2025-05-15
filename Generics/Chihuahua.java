package Generics;

public class Chihuahua {
    String name;

    public Chihuahua(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chihuahua{" +
                "name='" + name + '\'' +
                '}';
    }
}
