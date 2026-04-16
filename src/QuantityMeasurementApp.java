public class QuantityMeasurementApp {

    // Supported units
    enum Unit {
        FEET,
        INCH
    }

    // ---------------- GENERIC CLASS (DRY PRINCIPLE) ----------------
    static class QuantityLength {

        private double value;
        private Unit unit;

        public QuantityLength(double value, Unit unit) {
            this.value = value;
            this.unit = unit;
        }

        // Convert everything to FEET (base unit)
        private double toFeet() {
            switch (unit) {
                case FEET:
                    return value;

                case INCH:
                    return value / 12.0;

                default:
                    throw new IllegalArgumentException("Unsupported unit");
            }
        }

        // Equality check
        public boolean areEqual(QuantityLength other) {
            double epsilon = 0.0001;
            return Math.abs(this.toFeet() - other.toFeet()) < epsilon;
        }
    }

    // Static compare method (as per requirement style)
    public static boolean compare(QuantityLength q1, QuantityLength q2) {
        return q1.areEqual(q2);
    }

    // MAIN METHOD
    public static void main(String[] args) {

        // Hard-coded values (UC3 requirement)
        QuantityLength feet1 = new QuantityLength(5.0, Unit.FEET);
        QuantityLength feet2 = new QuantityLength(5.0, Unit.FEET);

        QuantityLength inch1 = new QuantityLength(12.0, Unit.INCH);
        QuantityLength inch2 = new QuantityLength(12.0, Unit.INCH);

        // Comparisons
        boolean feetResult = compare(feet1, feet2);
        boolean inchResult = compare(inch1, inch2);

        // Output
        System.out.println("Feet equal: " + feetResult);
        System.out.println("Inch equal: " + inchResult);
    }
}