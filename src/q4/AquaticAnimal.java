package q4;

public class AquaticAnimal extends Animal {
    public AquaticAnimal(String name) {
        super(name);
    }

    public void breathe() {
        System.out.printf("%s %s breathes through gills.%n",
                getClass().getSimpleName(), getName());
    }
}
