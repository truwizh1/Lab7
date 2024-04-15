public class Dog extends Mammal {
    private String breed;

    public Dog() {}

    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor);
        this.breed = breed;
    }

    public Dog(String furColor, String breed) {
        super(furColor);
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(name + " the Dog is eating.");
    }

    @Override
    public String getVoice() {
        return name + " barks: Woof!";
    }

    // Specific method for Dog class
    public void wagTail() {
        System.out.println(name + " is wagging its tail.");
    }

    // Getters and Setters
    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                "} " + super.toString();
    }
}
public class Dog extends Mammal {
    private String breed;

    public Dog() {}

    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor);
        this.breed = breed;
    }

    public Dog(String furColor, String breed) {
        super(furColor);
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(name + " the Dog is eating.");
    }

    @Override
    public String getVoice() {
        return name + " barks: Woof!";
    }

    // Specific method for Dog class
    public void wagTail() {
        System.out.println(name + " is wagging its tail.");
    }

    // Getters and Setters
    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                "} " + super.toString();
    }
}
