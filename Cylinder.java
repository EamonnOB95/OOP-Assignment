public class Cylinder extends circleBase {
  // Class data
  private int height;

  // Constructors
  public Cylinder() {
    super();
    this.height = 1;
  }
  public Cylinder(int aRadius, int aHeight) {
    super(aRadius);
    this.height = aHeight;
  }

  // Public methods
  public double calculateVolume() {
    // Formula for cylinder volume 
    // πr^2h
    double r=this.radius*1.0, h=this.height*1.0;
    return Math.PI*Math.pow(r,2)*h;
  }

  public double calculateSurfaceArea() {
    // Forumla for cylinder surface area
    // 2πrh + 2πr^2 
    double r=this.radius*1.0, h=this.height*1.0;
    return (2*Math.PI*r*h)+(2*Math.PI*Math.pow(r,2));
  }

  // Getters and setters
  public void setHeight(int aHeight) {
    this.height = aHeight;
  }
  public int getHeight() {
    return this.height;
  }
}