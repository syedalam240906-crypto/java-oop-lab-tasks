// ============================================
// OOP LAB TASK 3 - Arrays and Strings
// Name: Syed Amaan
// University: IoBM - BS Data Science
// ============================================

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

// ---- Q1: Array of Month Names ----
class Q1_MonthNames {
    public static void main(String[] args) {
        String[] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
    }
}

// ---- Q2: Months with Random Decimal Values and Average ----
class Q2_MonthValues {
    public static void main(String[] args) {
        String[] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };
        double[] values = new double[12];
        Random rand = new Random();
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            values[i] = rand.nextDouble() * 100;
            sum += values[i];
        }
        System.out.println("Month\t\tValue");
        for (int i = 0; i < months.length; i++) {
            System.out.printf("%-10s\t%.2f\n", months[i], values[i]);
        }
        double average = sum / values.length;
        System.out.printf("\nAverage Value: %.2f\n", average);
    }
}

// ---- Q3: Calculate Average of Array Elements ----
class Q3_AverageArray {
    public static void main(String[] args) {
        int[] numbers = {2020, 2021, 2022, 2023, 2024, 2025, 2026};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;
        System.out.println("Average value: " + average);
    }
}

// ---- Q4: Reverse an Array of Integer Values ----
class Q4_ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {2020, 2021, 2022, 2023, 2024, 2025, 2026};
        System.out.println("Original Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
        System.out.println("\nReversed Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

// ---- Q5: Sort a Numeric Array and a String Array ----
class Q5_SortArrays {
    public static void main(String[] args) {
        int[] numbers = {50, 20, 40, 10, 30};
        String[] names = {"Babar", "Virat", "Rafay", "Mustafa", "Taha"};
        Arrays.sort(numbers);
        Arrays.sort(names);
        System.out.println("Sorted Numeric Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n\nSorted String Array:");
        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}

// ---- Q6: Check if String is Palindrome ----
class Q6_PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String original = str;
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }
        sc.close();
    }
}

// ---- Q7: Reverse Words in a String ----
class Q7_ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        System.out.println("Reversed sentence:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
        sc.close();
    }
}
