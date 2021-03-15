import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class AssessmentDriver {
  public static void main(String[] args) {
    // Variables
    int choice, radius, height;
    ArrayList<circleBase> objects = new ArrayList<>();
    String input;

    // Create ArrayList of 5 circleBase Objects
    for(int i=0;i<5;i++) {
      // Get choice for Cone or Cylinder
      Object[] options = {"Cone","Cylinder"};
      choice = JOptionPane.showOptionDialog(null,
      "Choose either a Cone or a Cylinder",
      "Object Selection",
      JOptionPane.YES_NO_OPTION,
      JOptionPane.PLAIN_MESSAGE,
      null,
      options,
      null);
      // If not cancelled at choice pane then proceed
      if(choice != -1) {
        // Get radius
        input = getNumberFromUser("Please input a radius:");
        if(input == null) {
          break;
        }
        radius = Integer.parseInt(input);
        // Get height
        input = getNumberFromUser("Please input a height:");
        if(input == null) {
          break;
        }
        height = Integer.parseInt(input);
        // Add objects
        if(choice == 0) {
          objects.add(new Cone(radius, height));
        }
        else if(choice == 1) {
          objects.add(new Cylinder(radius, height));
        }
      }
      // If user cancelled cone and cylinder selection pane
      else {
        break;
      }
    } 

    // If objects have been created then sort and print
    if(objects.size() > 0) {
      Collections.sort(objects);
      printCircleBaseObjects(objects);
    }
  }

  // Print list of circleBase objects using a html table in a JOptionPane window
  public static void printCircleBaseObjects(ArrayList<circleBase> objects) {
    // Variables
    StringBuilder output = new StringBuilder();
    circleBase obj;

    // Table opening tags
    output.append("<HTML><table>");

    output.append("<tr><td></td><td>Type</td><td>Surface Area</td></tr>");
    // Smallest object
    obj = objects.get(0);
    output.append("<tr><th>Smallest object:</th>");
    output.append("<td>" + obj.getType() + "</td>");
    output.append("<td>" + String.format("%.2f", obj.calculateSurfaceArea()) + "</td></tr>");
    // Biggest object
    obj = objects.get(objects.size()-1);
    output.append("<tr><th>Biggest object:</th>");
    output.append("<td>" + obj.getType() + "</td>");
    output.append("<td>" + String.format("%.2f", obj.calculateSurfaceArea()) + "</td></tr>");

    // Count of objects
    output.append("<tr><th colspan=\"2\">Number of objects entered:</th><td>" + objects.size() + "</td></tr>");

    // Table closing tags
    output.append("</table></html>");

    JOptionPane.showMessageDialog(null, output.toString(), "Summary of Objects", JOptionPane.INFORMATION_MESSAGE);
  }

  // Method to get a positive number from the user using JOptionPane. 
  // Checks for valid input including user cancelling out of program.
  public static String getNumberFromUser(String message) {
    // Variables
    String input, errorMessage;
    String pattern = "[0-9]+";

    // Do-while loop to ensure a whole number is entered
    do {
        input = JOptionPane.showInputDialog(null, message);
        if(input == null) {
          return null;
        }
        else if(input.isEmpty()) {
          errorMessage = "You didn't enter anything?!";
          JOptionPane.showMessageDialog(null, errorMessage, "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
        else if(!input.matches(pattern)) {
          errorMessage = "You need to enter a whole number!";
          JOptionPane.showMessageDialog(null, errorMessage, "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }

    } while(!input.matches(pattern) && input != null);

    return input;
  }
}
