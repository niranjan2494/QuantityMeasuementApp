public class QuantityMeasurementApp {

    // ---------------- FEET CLASS ----------------
    static class Feet {
        private double value1;
        private double value2;

        public Feet(double value1, double value2) {
            this.value1 = value1;
            this.value2 = value2;
        }

        public boolean areEqual() {
            double epsilon = 0.0001;
            return Math.abs(value1 - value2) < epsilon;
        }
    }

    // ---------------- INCH CLASS ----------------
    static class Inch {
        private double value1;
        private double value2;

        public Inch(double value1, double value2) {
            this.value1 = value1;
            this.value2 = value2;
        }

        public boolean areEqual() {
            double epsilon = 0.0001;
            return Math.abs(value1 - value2) < epsilon;
        }
    }

    // Static method for Feet comparison
    public static boolean compareFeet(double v1, double v2) {
        Feet feet = new Feet(v1, v2);
        return feet.areEqual();
    }

    // Static method for Inch comparison
    public static boolean compareInch(double v1, double v2) {
        Inch inch = new Inch(v1, v2);
        return inch.areEqual();
    }

    // MAIN METHOD
    public static void main(String[] args) {

        // Hard-coded values (as per UC2)
        double feetValue1 = 5.0;
        double feetValue2 = 5.0;

        double inchValue1 = 12.0;
        double inchValue2 = 12.0;

        // Comparisons
        boolean feetResult = compareFeet(feetValue1, feetValue2);
        boolean inchResult = compareInch(inchValue1, inchValue2);

        // Output
        System.out.println("Feet equal: " + feetResult);
        System.out.println("Inch equal: " + inchResult);
    }
}