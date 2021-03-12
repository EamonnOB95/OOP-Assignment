import java.util.ArrayList;
import java.util.Collections;
import java.swing.JOptionPane;

public class AssessmentDriver {
  public static void main(String[] args) {
    // Variables
    int choice, radius, height;
    ArrayList<circleBase> objects = new ArrayList<>();
    String message;
    
    // Create ArrayList of 5 circleBase Objects
    for(int i=0;i<5;i++) {
      message = "Please select 1 for Cone, or 2 for Cylinder";
      choice = ;
      radius = (int)(Math.random() * 20 + 1);
      height = (int)(Math.random() * 20 + 1);
      
      if(choice == 1) {
        objects.add(new Cone(radius,height));
      }
      else if(choice == 2) {
        objects.add(new Cylinder(radius, height));
      }
    }

    // Sort
    Collections.sort(objects);

    // Print sorted ArrayList
    for(circleBase obj: objects) {
      System.out.printf("Surface area: %.3f\n",obj.calculateSurfaceArea());
    }
  }

  public int getIntFromUser(int min, int max, String message) {
    boolean valid = false;
    String input = "";
    int num=0;

    while(!valid) {
      try {
        input = JOptionPane.showInputDialog(null, message)
        num = Integer.parseInt(input);
        if(num >= min && num <= max) {
          valid = true;
        }
      }
      catch(Exception e) {
        System.out.println("Please enter a valid input!");
      }
    }
    
    return num;
  }
}