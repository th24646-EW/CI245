package Home_Work;

//Home Work: Weekly Hours
//Date: 4/29/2026
//Programmer: SirAndrae Thomas

import java.util.Scanner;

public class Hw2_WeeklyHours {

    public static void main(String[] args) {
        String[] NAMES = {"Tom", "Jane", "Mark"};
        String[] DAYS = {"MON", "TUE", "WED", "THU", "FRI"};

        double[][] hours = new double[NAMES.length][DAYS.length];

        input_hours(hours, NAMES, DAYS);
        display_hours(hours, NAMES, DAYS);

        System.out.println("----------------------------------------");
        System.out.printf("Total hours : %.1f\n", totalHours(hours, NAMES, DAYS));

        totalHoursByEmployee(hours, NAMES, DAYS);
    }

    // Input hours
    public static void input_hours(double[][] hours, String[] NAMES, String[] DAYS) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < NAMES.length; i++) {
            System.out.println("\nEnter the work hours for " + NAMES[i]);
            for (int j = 0; j < DAYS.length; j++) {
                System.out.print(DAYS[j] + " : ");
                hours[i][j] = sc.nextDouble();
            }
        }
    }

    // Display hours table
    public static void display_hours(double[][] hours, String[] NAMES, String[] DAYS) {
        System.out.println("\n\nDisplay Weekly Work Hours");

        System.out.printf("%8s", "");
        for (String day : DAYS) {
            System.out.printf("%6s", day);
        }
        System.out.println();

        System.out.println("----------------------------------------");

        for (int i = 0; i < NAMES.length; i++) {
            System.out.printf("%-6s|", NAMES[i]);
            for (int j = 0; j < DAYS.length; j++) {
                System.out.printf("%6.1f", hours[i][j]);
            }
            System.out.println();
        }
    }

    // Total hours
    public static double totalHours(double[][] hours, String[] NAMES, String[] DAYS) {
        double total = 0;

        for (int i = 0; i < NAMES.length; i++) {
            for (int j = 0; j < DAYS.length; j++) {
                total += hours[i][j];
            }
        }

        return total;
    }

    // Total hours by employee
    public static void totalHoursByEmployee(double[][] hours, String[] NAMES, String[] DAYS) {
        System.out.println("\n\nTotal Hours By Employee");
        System.out.println("----------------------------------------");

        for (int i = 0; i < NAMES.length; i++) {
            double sum = 0;
            for (int j = 0; j < DAYS.length; j++) {
                sum += hours[i][j];
            }
            System.out.printf("%-6s| %6.1f\n", NAMES[i], sum);
        }
    }
}
