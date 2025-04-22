package domain;

public class Animal {
    protected String name;
    protected int weight;

    public Animal() {
        System.out.println("Лісова тварина");
    }

    public void eat() {
        System.out.println(name + " їсть насіння, гриби, фрукти і багато іншого.");
    }

    public void speak() {
        System.out.println(name + " видає звук.");
    }

    @Override
    public String toString() {
        return "Тварина [ім'я=" + name + ", вага=" + weight + " г]";
    }
}