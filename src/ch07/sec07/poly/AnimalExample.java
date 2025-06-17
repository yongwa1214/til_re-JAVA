package ch07.sec07.poly;

public class AnimalExample {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Tiger tiger = new Tiger();
        Dog dog = new Dog();
        Cow cow = new Cow();

        animalCrying(cat);
        animalCrying(tiger);
    }

    public static void animalCrying(Animal animal){
        animal.crying();
    } // 다형성을 써먹는다 
}
