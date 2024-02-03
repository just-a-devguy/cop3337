import java.util.Scanner;

/**
 * This program demonstrates how to rearrange an array so that all positive numbers appear before all negative numbers.
 * It prompts the user to input the elements of the array and then rearranges the array in place.
 */
public class PositiveNegative {
    // Rearranges the elements of the array so that positive numbers appear before negative numbers
    public void rearrange(int[] arr) {
        int[] pos = new int[arr.length];
        int[] neg = new int[arr.length];
        int posIdx = 0, negIdx = 0;

        // Separate positive and negative numbers into separate arrays
        for (int num : arr) {
            if (num > 0) {
                pos[posIdx++] = num;
            } else {
                neg[negIdx++] = num;
            }
        }

        // Copy positive numbers back into the original array
        int i = 0;
        for (; i < posIdx; i++) {
            arr[i] = pos[i];
        }

        // Copy negative numbers back into the original array after positive numbers
        for (int j = 0; j < negIdx; j++) {
            arr[i + j] = neg[j];
        }
    }

    // Prints the elements of the array
    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array of the specified size
        int[] x = new int[n];

        // Ask the user to input the elements of the array
        System.out.println("Enter the elements of the array (positive and negative numbers): ");
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }

        // Create an instance of the PositiveNegative class
        PositiveNegative pn = new PositiveNegative();

        // Rearrange the array
        pn.rearrange(x);

        // Print the rearranged array
        System.out.println("Array after rearranging:");
        pn.printArray(x);

        // Close the scanner
        scanner.close();
    }
}
