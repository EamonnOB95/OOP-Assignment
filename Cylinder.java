public class Cylinder extends CircleBase {
    // Class data
    private int height;

    // Constructors
    public Cylinder() {
        super();
        setHeight(1);
    }

    public Cylinder(int radius, int height) {
        super(radius);
        setHeight(height);
    }

    // Public methods
    @Override
    public double surfaceArea() {
        return ((2 * Math.PI * getRadius() * getHeight()) + (2 * Math.PI * Math.pow(this.getRadius(), 2)));
    }

    public double volume() {
        return (Math.PI * Math.pow(getRadius(), 2) * getHeight());
    }

    @Override
    public String getType() {
        return "Cylinder";
    }

    // Getters and setters
    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

