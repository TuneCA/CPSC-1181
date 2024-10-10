import java.util.Arrays;

/**
 * The Train class represents a train with a name, locomotive power, and an
 * array of cars.
 * Each car has a specific weight, and the train has methods for managing cars
 * and calculating
 * total weight, max speed, etc.
 * 
 * @author Tat Tung Nguyen
 * 
 */
public class Train {
    private int power;
    private String name;
    private int[] cars;

    /**
     * Constructs a Train object with the specified name and power.
     *
     * @param trainName The name of the train.
     * @param power     The locomotive power of the train.
     */
    public Train(String trainName, int power) {
        this.name = trainName;
        this.power = power;
        this.cars = new int[0];

    }

    /**
     * Returns the locomotive power of the train.
     *
     * @return The power of the train .
     */
    public int getPower() {
        return power;
    }

    /**
     * Sets the locomotive power of the train.
     *
     * @param p The new power of the train in kW.
     * @throws IllegalArgumentException if the power is negative.
     */
    public void setPower(int p) {
        if (p < 0) {
            throw new IllegalArgumentException("Power cannot be negative");
        }
        this.power = p;
    }

    /**
     * Returns the name of the train.
     *
     * @return The name of the train.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the train.
     *
     * @param name The new name of the train.
     * @throws NullPointerException if the name is null.
     */
    public void setName(String name) {
        if (name == null) {
            throw new NullPointerException("Name must not be null");
        }
        this.name = name;
    }

    /**
     * Returns the array of car weights attached to the train.
     *
     * @return The array of car weights.
     */
    public int[] getCars() {
        return cars;
    }

    /**
     * Returns the total weight of all cars attached to the train.
     *
     * @return The total weight of cars in tons.
     */
    public int getTotalWeightOfCars() {
        int sum = 0;
        for (int i = 0; i < cars.length; i++) {
            sum += cars[i];
        }
        return sum;
    }

    /**
     * Returns the number of cars currently attached to the train.
     *
     * @return The number of cars.
     */
    public int getNumberOfCars(int[] cars) {
        return this.cars.length;
    }

    /**
     * Calculates the maximum speed of the train based on its power and total weight
     * of cars.
     *
     * @return The maximum speed of the train in km/h. The speed is capped at 150
     *         km/h and
     *         cannot be less than 0 km/h.
     */
    public int getMaxSpeed() {
        int maxSpeed;
        maxSpeed = this.getPower() - this.getTotalWeightOfCars();
        if (maxSpeed > 150) {
            maxSpeed = 150;
        }
        if (maxSpeed < 0) {
            maxSpeed = 0;
        }
        return maxSpeed;
    }

    /**
     * Returns a string representation of the train, including its name, power,
     * number of cars,
     * total weight of cars, and maximum speed.
     *
     * @return A string representation of the train.
     */
    public String toString() {
        return "Train Name: " + name + ", Locomotive Power: " + power +
                " kW, Number of Cars: " + cars.length + ", Total Weight of Cars: " +
                getTotalWeightOfCars() + " tons, Max Speed: " + getMaxSpeed() + " km/h";
    }

    /**
     * Removes all cars attached to the train, resetting the number of cars to zero.
     */
    public void removeAllCars() {
        cars = new int[0];
    }

    /**
     * Adds one or more cars to the train. The weight of each car is provided as an
     * argument.
     *
     * @param weights The weight(s) of the cars to be added.
     * @throws NullPointerException if the weights array is null.
     */
    public void addCars(int... weights) {
        if (weights == null) {
            throw new NullPointerException("The weights must not be null");
        }

        // Calculate the new capacity
        int newLength = cars.length + weights.length;

        // Resize the cars array
        cars = Arrays.copyOf(cars, newLength);

        // Add the new weights to array
        for (int i = 0; i < weights.length; i++) {
            cars[cars.length - weights.length + i] = weights[i];
        }
    }

    /**
     * Merges the current train with another train. The power of the other train is
     * added
     * to the current train, and the cars from the other train are transferred.
     * The other train is then reset to zero power and no cars.
     *
     * @param other The other train to merge with the current train.
     * @throws NullPointerException if the other train is null.
     */
    public void mergeTrains(Train other) {
        if (other == null) {
            throw new NullPointerException("The other train must not be null");
        }

        // Add power from the other train
        this.power += other.getPower();

        // Merge cars
        int[] otherCars = other.getCars();
        this.addCars(otherCars);

        // Clear the other train
        other.setPower(0);
        other.removeAllCars();
    }
}