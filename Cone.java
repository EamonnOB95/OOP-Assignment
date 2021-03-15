public class Cone extends circleBase {
  // Class data
  private int height;

  // Constructors
  public Cone() {
    super();
    this.height = 1;
  }
  public Cone(int aRadius, int aHeight) {
    super(aRadius);
    this.height = aHeight;
  }

  // Public methods
  public double calculateVolume() {
    // Formula for cone volume 
    // πr^2h/3
    double r=this.radius*1.0, h=this.height*1.0;
    return Math.PI*Math.pow(r,2)*(h/3);
  }

  public double calculateSurfaceArea() {
    // Forumla for cone surface area
    // πr(r+sqrt(h^2+r^2))
    double r=this.radius*1.0, h=this.height*1.0;
    return Math.PI*r*(r+Math.sqrt(Math.pow(h,2)+Math.pow(r,2)));
  }

  public String getType() {
    return "Cone";
  }

  // Getters and setters
  public void setHeight(int aHeight) {
    this.height = aHeight;
  }
  public int getHeight() {
    return this.height;
  }
}
