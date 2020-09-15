import java.util.Scanner; 

/**
 * Tells the user the biggest number out of 2 integers 
 * @author Neil Fischer 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a Scanner for user input 
    Scanner input = new Scanner(System.in);  

    // prompt the user to enter an integer 
    System.out.println("Please enter a integer"); 
    int A = input.nextInt(); 

    // prompt the user to enter a second integer 
    System.out.println("Please enter another integer"); 
    int B = input.nextInt(); 

    // Find out which number is the biggest 
    if (A > B) {
      System.out.println("the biggest number is " + A); 
    } else {
      System.out.println("The biggest number is " + B);
    }

  }
}
