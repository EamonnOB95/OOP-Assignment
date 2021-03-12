abstract class circleBase implements Comparable<circleBase> {
  // Class data
  private String colour;
  protected int radius;

  // Constructors
  public circleBase() {
    this.radius = 1;
    this.colour = "No Colour";
  }
  public circleBase(int aRadius) {
    this.radius = aRadius;
    this.colour = "No Colour";
  }
  public circleBase(int aRadius, String colour) {
    this.radius = aRadius;
    this.colour = colour;
  }

  // Abstract methods
  public abstract double calculateSurfaceArea();

  // Public methods
  @Override
  public int compareTo(circleBase c) {
    return this.calculateSurfaceArea()<c.calculateSurfaceArea() ? -1 : this.calculateSurfaceArea()==c.calculateSurfaceArea() ? 0 : 1;
  }

  // Getters and setters
  public void setColour(String aColour) {
    this.colour = aColour;
  }
  public String getColour() {
    return this.colour;
  }
  public void setRadius(int aRadius) {
    this.radius = aRadius;
  }
  public int getRadius()  {
    return this.radius;
  }
}