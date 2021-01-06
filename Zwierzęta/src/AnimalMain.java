public class AnimalMain {
    public static void main(String[] args) {
        Cat kotek = new Cat("Cycek","Rudy","Miau Miau");
        Dog roki = new Dog("Bombel","Biały","Hau Hau");
        System.out.println(kotek.makeSound());
        System.out.println(roki.makeSound());
    }
}
