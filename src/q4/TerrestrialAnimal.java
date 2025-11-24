package q4;

public class TerrestrialAnimal extends Animal {
    public TerrestrialAnimal(String name) {
        super(name);
    }

    public void breathe() {
        System.out.printf("%s %s breathes through lungs.%n",
                getClass().getSimpleName(), getName());
    }
}
