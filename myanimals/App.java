import myanimals.Cat;
import myanimals.Dog;

public void main() {
    IO.println(Cat.getNumOfAnimals());

    Cat myCat = new Cat();
    myCat.makeNoise();
    myCat.eat();
    myCat.name = "Stella";
    myCat.age = 8;
    IO.println(Cat.MAX_LIVES);
    IO.println(Cat.getNumOfAnimals());

    Dog myDog = new Dog();
    myDog.makeNoise();
    myDog.eat();
    myDog.name = "Puff";
    myDog.age = 4;
    IO.println(Dog.MAX_LIVES);
    IO.println(Dog.getNumOfAnimals());
}
