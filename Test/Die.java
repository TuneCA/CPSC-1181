import java.util.Random;
class Die {
    private int sides;
    private int faceValue;
    private String color;

    // Constructor to initialize the number of sides and color
    public Die(int sides, String color) {
        this.sides = sides;
        this.color = color;
        this.roll(); // Initial roll to set the face value
    }

    // Roll the die to get a random face value
    public void roll() {
        Random rand = new Random();
        this.faceValue = rand.nextInt(sides) + 1; // Random value between 1 and sides
    }

    // Getter for face value
    public int getFaceVal() {
        return faceValue;
    }

    // Setter for face value (useful for testing or setting a fixed value)
    public void setFaceVal(int faceValue) {
        if (faceValue > 0 && faceValue <= sides) {
            this.faceValue = faceValue;
        } else {
            System.out.println("Invalid face value!");
        }
    }

    // toString method to provide a textual representation of the die
    public String toString() {
        return "Die with " + sides + " sides, showing " + faceValue + ", color: " + color;
    }
}