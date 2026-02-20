package myanimals;// myanimals.Cat.java
// 2/19/26

public class Cat extends Animal {

    public static final int MAX_LIVES = 9;
    int livesRemaining;

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Meow, meow,meow!");
    }

    public Cat () {
        numOfAnimals++;
        livesRemaining = MAX_LIVES;
    }

    public static int getNumOfAnimals() {
        return numOfAnimals;
    }
}