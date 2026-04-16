public class QuantityMeasurementApp {

    // Method to compare two values in feet
    public boolean areEqual(double value1, double value2) {
        double epsilon = 0.0001; // handles decimal precision
        return Math.abs(value1 - value2) < epsilon;
    }

    public static void main(String[] args) {

        // Create object
        QuantityMeasurementApp app = new QuantityMeasurementApp();

        // Input values (you can change these)
        double value1 = 5.0;
        double value2 = 5.0;

        // Compare values
        boolean result = app.areEqual(value1, value2);

        // Output result
        System.out.println("Are the two measurements equal? " + result);
    }
}