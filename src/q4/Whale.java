package q4;

class Whale extends AquaticAnimal {
    public Whale(String name) {
        super(name);
    }

    public void breathe() {
        System.out.printf("Whale %s breathes through lungs.%n", getName());
    }
}