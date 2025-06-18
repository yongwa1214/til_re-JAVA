package ch07.sec07.poly;

public class AnimalExample {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Tiger tiger = new Tiger();
        Dog dog = new Dog();
        Cow cow = new Cow();
        Chihuahua chihuahua = new Chihuahua();

        animalCrying(cat);
        animalCrying(tiger);
        animalCrying(cow);
        animalCrying(dog);
        animalCrying(chihuahua);
    }

    public static void animalCrying(Animal animal){
        animal.crying();// 다형성을 써먹는다
        // Dog 객체 넘어오면 jump 메소드 호춣주세요.

        //1. jump() 메소드를 호출하려면 타입이 Dog 가 되어야 한다.

        // 2. Dog 객체가 들어왔을 때만 Dog 타입으로 형변환을 해야한다.
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.jump();
        }

    }
}
