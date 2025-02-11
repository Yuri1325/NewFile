import java.lang.*;
import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 * Project: Comments in Java
 * Name: Uri R
 * Teacher: Karen Connell
 * Date: 2/11/2025
 */
public class main{
    public static Scanner scanner;
    public static JOptionPane jpane;
    public static void main(String [] args){
        jpane = new JOptionPane();
        String name = jpane.showInputDialog(null, "What is your Name?");
        while (true){
            jpane.showMessageDialog(null, "Hello "+name);
        }
       
}
}