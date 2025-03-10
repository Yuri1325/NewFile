import java.util.Scanner;

import javax.swing.JOptionPane;

public class main {
  public static int appNumber;
  public static final double PI = 3.14;
  
    public static void main(String[]args) {
      
      Scanner scanner = new Scanner(System.in);
      System.out.println("Which app would you like to preview");
      appNumber = scanner.nextInt();
      
      switch (appNumber) {
        case 0:
          System.out.println("Enter the amount of poles: ");
          int numOfPoles = scanner.nextInt();
          double calc1 =(( PI*Math.pow(1.5, 2)*5)*numOfPoles)/7;
          System.out.println("You need "+calc1+" cubic yards of concrete");
          break;

        case 1:
          System.out.println("Enter m: ");
          int m = scanner.nextInt();
          System.out.println("Enter n: ");
          int n = scanner.nextInt();

          double sideOne = Math.pow(m, 2) - Math.pow(n, 2);
          double sideTwo =(n*m)*2;
          double hypotenuse = Math.pow(m, 2) + Math.pow(n, 2);
          double cost = (2.412*sideOne)+(3.767*sideTwo)+ (15.758*hypotenuse);
          System.out.println("Your tripple is "+ sideOne+","+sideTwo+","+hypotenuse+" and your cost is "+cost);
          break;
      }
      
    }
    
}
