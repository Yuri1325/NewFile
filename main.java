import java.util.Scanner;
public class TimeConversion {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter the time in minutes: ");
  int totalMinutes = scanner.nextInt();
  int hours = totalMinutes / 60;
  int minutes = totalMinutes % 60;
  System.out.printf("The time is: %d:%02d\n", hours, minutes);
  }
}
// Exercise 10: Sleep Calculation

public class Sleep {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter your birthdate:");
  System.out.print("Year: ");
  int birthYear = scanner.nextInt();
  System.out.print("Month: ");
  int birthMonth = scanner.nextInt();
  System.out.print("Day: ");
  int birthDay = scanner.nextInt();
  // Prompt user for current date
  System.out.println("Enter today's date:");
  System.out.print("Year: ");
  int currentYear = scanner.nextInt();
  System.out.print("Month: ");
  int currentMonth = scanner.nextInt();
  System.out.print("Day: ");
  int currentDay = scanner.nextInt();
  int totalDays = ((currentYear - birthYear) * 365) + ((currentMonth -
  birthMonth) * 30) + (currentDay - birthDay);
  int sleepHours = totalDays * 8;
  System.out.println("You have been alive for " + totalDays + " days.");
  System.out.println("You have slept " + sleepHours + " hours.");
  }
}
