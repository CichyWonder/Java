public class Animal {
    protected String color;
    protected String name;

    public Animal(String color, String name){
        this.color=color;
        this.name=name;
    }
}
    class Dog extends Animal{
    private String sound;

    public Dog(String name, String color, String sound){
        super(name,color);
        this.sound=sound;
    }
    public String makeSound(){
        return sound + " " + " " + color + " " + name;
    }
}
    class Cat extends Animal{
    private String sound;

    public Cat(String name, String color, String sound) {
        super(name, color);
        this.sound = sound;
    }
    public String makeSound() {
        return sound + " " + " " + color + " " + name;
    }
}


