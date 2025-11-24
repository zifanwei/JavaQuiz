package q4;

abstract class Animal {
    // Animal 为 abstract class，因为 Animal 本身没有具体的呼吸方式，不应该被直接实例化（也就是使用普通的class/object）。
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void introduce() {
        System.out.println("I am " + name);
    }

    public abstract void breathe();
}