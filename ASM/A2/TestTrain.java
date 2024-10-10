import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

/**
 * The TestTrain class contains unit tests for the Train class,
 * verifying the functionality of its methods and ensuring proper behavior under
 * various conditions.
 * 
 * @author Tat Tung Nguyen
 * 
 */
public class TestTrain {

    @Test
    public void testConstructor() {
        Train train = new Train("Tune", 100);
        assertEquals("Tune", train.getName());
        assertEquals(100, train.getPower());
        assertEquals(0, train.getNumberOfCars(train.getCars()));
        assertEquals(0, train.getTotalWeightOfCars());
    }

    @Test
    public void testGetPower() {
        Train train = new Train("Tune", 100);
        assertEquals(100, train.getPower());
    }

    @Test
    public void testSetPower() {
        Train train = new Train("Tune", 100);
        train.setPower(200);
        assertEquals(200, train.getPower());
        try {
            train.setPower(-10);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Power cannot be negative", e.getMessage(), "Exception message should match");
        }
    }

    @Test
    public void testGetName() {
        Train train = new Train("Tune", 120);
        assertEquals("Tune", train.getName());
    }

    @Test
    public void testSetName() {
        Train train = new Train("Freight", 150);
        train.setName("Tune");
        assertEquals("Tune", train.getName());
        train.setName("Hue");
        assertEquals("Hue", train.getName());
        try {
            train.setName(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("Name must not be null", e.getMessage(), "Exception message should match");
        }

    }

    @Test
    public void testAddCars() {
        Train train = new Train("Freight", 200);
        train.addCars(10, 20, 30);

        assertEquals(3, train.getNumberOfCars(train.getCars()));
        assertArrayEquals(new int[] { 10, 20, 30 }, train.getCars());

        // Test adding more cars to the train (testing array resizing)
        train.addCars(80, 90);
        assertEquals(5, train.getNumberOfCars(train.getCars()));
        assertArrayEquals(new int[] { 10, 20, 30, 80, 90 }, train.getCars());
        // Test null input for cars
        try {
            train.addCars(null);
            fail("Expected an NullPointerException");
        } catch (NullPointerException e) {

        }
    }

    @Test
    public void testRemoveAllCars() {
        Train train = new Train("Tune", 120);
        train.addCars(20, 30);
        assertEquals(2, train.getNumberOfCars(train.getCars()));

        train.removeAllCars();
        assertEquals(0, train.getNumberOfCars(train.getCars()));
        assertEquals(0, train.getTotalWeightOfCars());
    }

    @Test
    public void testGetTotalWeightOfCars() {
        Train train = new Train("Freight", 200);
        train.addCars(100, 150);
        assertEquals(250, train.getTotalWeightOfCars());

        train.addCars(50);
        assertEquals(300, train.getTotalWeightOfCars());
    }

    @Test
    public void testGetMaxSpeed() {
        Train train = new Train("Tune", 300);
        train.addCars(50, 50);
        assertEquals(150, train.getMaxSpeed()); // Max speed after adding 100

        train.addCars(100);
        assertEquals(100, train.getMaxSpeed()); // Heavier load slows train down

        train.addCars(400);
        assertEquals(0, train.getMaxSpeed()); // Speed goes 0 due to heavy load

        train.setPower(800); // Increase power
        assertEquals(150, train.getMaxSpeed()); // MaxSpeed over 150 is set to 150
    }

    @Test
    public void testMergeTrains() {
        Train train1 = new Train("Tune", 200);
        Train train2 = new Train("Freight", 150);

        train1.addCars(50, 60);
        train2.addCars(70, 80);

        train1.mergeTrains(train2);

        // Check the merged train
        assertEquals(350, train1.getPower()); // 200 + 150
        assertEquals(4, train1.getNumberOfCars(train1.getCars())); // 2 from train1 + 2 from train2
        assertArrayEquals(new int[] { 50, 60, 70, 80 }, train1.getCars());
        assertEquals(90, train1.getMaxSpeed()); // 350 - 50 -60 -70 -80 = 90

        // Check that train2 is cleared
        assertEquals(0, train2.getPower());
        assertEquals(0, train2.getNumberOfCars(train2.getCars()));
        assertArrayEquals(new int[0], train2.getCars());
        // Check other train is null
        Train train3 = new Train("Yuto", 2000);
        try {
            train3.mergeTrains(null);
            fail("Expected an NullPointerException");
        } catch (NullPointerException e) {
        }
    }
}
