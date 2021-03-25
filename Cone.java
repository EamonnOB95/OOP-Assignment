public class Cone extends CircleBase {
    // Class data
    private int height;

    // Contructors
    public Cone() {
        super();
        setHeight(1);
    }

    public Cone(int radius, int height) {
        super(radius);
        setHeight(height);
    }

    // Public methods
    @Override
    public double surfaceArea() {
        return (Math.PI * getRadius()) * (getRadius() + Math.sqrt(Math.pow(getHeight(), 2) + Math.pow(getRadius() ,2)));
    }

    public double volume() {
        return (1/3d) * (Math.PI * Math.pow(this.getRadius(), 2) * this.getHeight());
    }

    @Override
    public String getType() {
        return "Cone";
    }

    // Getters and setters
    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

