package q4;

public class AnimalMain {
    public static void main(String[] args) {
        System.out.println("--- Fish ---");
        Fish f = new Fish("Nemo");
        f.introduce();
        f.breathe();

        System.out.println();
        System.out.println("--- Whale ---");
        Whale w = new Whale("Willy");
        w.introduce();
        w.breathe();

        System.out.println();
        System.out.println("--- Cat ---");
        Cat c = new Cat("Tom");
        c.introduce();
        c.breathe();
    }
}