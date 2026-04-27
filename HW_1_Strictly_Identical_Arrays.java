package Home_Work;

import java.util.Scanner;

//Home Work: Strictly Identical Arrays
//Date: 4/27/2026
//Programmer: SirAndrae Thomas

public class HW_1_Strictly_Identical_Arrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        // Ask for number of elements
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        int[] list1 = new int[n];
        int[] list2 = new int[n];

        // Input list1
        System.out.println("Enter numbers for list 1:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            list1[i] = input.nextInt();
        }

        // Step 3: Input list2
        System.out.println("Enter numbers for list 2:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            list2[i] = input.nextInt();
        }

        // Display lists
        display(list1, "List 1");
        display(list2, "List 2");

        // Compare
        if (equals(list1, list2)) {
            System.out.println("Two lists are identical");
        } else {
            System.out.println("Two lists are NOT identical");
        }
    }

    // Method to display array
    public static void display(int[] list, String name) {
        System.out.println(name + ":");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println("\n----------------------");
    }

    // Method to compare arrays
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }

        return true;
    }
}
