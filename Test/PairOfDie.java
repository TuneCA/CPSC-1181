class PairOfDie {
    private Die firstDie;
    private Die secondDie;

    // Constructor to initialize the two dice
    public PairOfDie(Die firstDie, Die secondDie) {
        this.firstDie = firstDie;
        this.secondDie = secondDie;
    }

    // Roll both dice
    public void rollDice() {
        firstDie.roll();
        secondDie.roll();
    }

    // Get the sum of both dice face values
    public int getSum() {
        return firstDie.getFaceVal() + secondDie.getFaceVal();
    }

    // Get the first die's value
    public int getFirstVal() {
        return firstDie.getFaceVal();
    }

    // Set the first die's value
    public void setFirstVal(int val) {
        firstDie.setFaceVal(val);
    }

    // toString method to provide a summary of both dice
    public String toString() {
        return "First Die: " + firstDie.toString() + "\nSecond Die: " + secondDie.toString();
    }
}