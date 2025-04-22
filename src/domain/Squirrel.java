package domain;

public class Squirrel extends RodentAnimal {
    private String furColor;

    public Squirrel() {
        System.out.println("Створено нову білку!");
    }

    public Squirrel(String name, int weight, String furColor) {
        this.name = name;
        this.weight = weight;
        this.furColor = furColor;
        System.out.println("Білка на ім'я " + name + "!");
    }

    @Override
    public void speak() {
        System.out.println(name + " видає пискливі звуки.");
    }

    public void climb() {
        System.out.println(name + " швидко лазить по деревах!");
    }

    public void collectNuts() {
        System.out.println(name + " збирає та ховає їжу на зиму.");
    }

    @Override
    public String toString() {
        return "Білка [ім'я=" + name + ", вага=" + weight + " г, колір хутра=" + furColor + "]";
    }
}