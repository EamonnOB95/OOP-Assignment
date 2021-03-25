public abstract class CircleBase implements Comparable<CircleBase> {
    // Class data
    private String colour;
    protected int radius;

    // Constructors
    public CircleBase() {
        this.radius = 1;
        this.colour = "";
    }

    public CircleBase(int radius) {
        this.radius = radius;
        this.colour = "";
    }

    public CircleBase(int radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    // Abstract methods
    public abstract double surfaceArea();
    public abstract String getType();

    // Implemented Methods
    @Override
    public int compareTo(CircleBase circle) {
        return Double.compare(this.surfaceArea(), circle.surfaceArea());
    }

    // Getters and setters
    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

}
