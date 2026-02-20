package myanimals;

public class Dog extends Animal {
    public static final int MAX_LIVES = 1;
    int livesRemaining;

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Bark, bark, bark!");
    }

    public Dog () {
        Animal.numOfAnimals++;
        livesRemaining = MAX_LIVES;
    }

    public static int getNumOfAnimals() {
        return Animal.numOfAnimals;
    }
}
