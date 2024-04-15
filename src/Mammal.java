public class Mammal extends Animal {
    protected String furColor;

    public Mammal() {}

    public Mammal(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    public Mammal(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public void eat() {
        System.out.println(name + " the Mammal is eating.");
    }

    @Override
    public String getVoice() {
        return name + " says: Some mammal sound!";
    }

    // Getters and Setters
    public String getFurColor() { return furColor; }
    public void setFurColor(String furColor) { this.furColor = furColor; }

    @Override
    public String toString() {
        return "Mammal{" +
                "furColor='" + furColor + '\'' +
                "} " + super.toString();
    }
}
