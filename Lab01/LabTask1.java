// ============================================
// OOP LAB TASK 1 - Java Basics
// Name: Syed Amaan
// University: IoBM - BS Data Science
// ============================================

// ---- Task 1: Print Name and Section ----
class Task1_PrintNameSection {
    public static void main(String[] args) {
        System.out.println("Syed Amaan");
        System.out.println("Section: Bs Data Science");
    }
}

// ---- Task 2: Show All Data Types ----
class Task2_DataTypes {
    public static void main(String[] args) {
        System.out.println("int a=2");
        System.out.println("byte b=3");
        System.out.println("short c=4");
        System.out.println("long d=123758585887L");
        System.out.println("char e='A'");
        System.out.println("float f=4.54f");
        System.out.println("double g=4.34");
        System.out.println("boolean h=true");
        System.out.println("string i=Amaan");
    }
}

// ---- Task 3: Convert Inches to Meters ----
import java.util.Scanner;

class Task3_InchesToMeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter inches");
        double inch = sc.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(meters + " meters");
        sc.close();
    }
}

// ---- Task 4: Convert Days to Months and Days ----
class Task4_DaysToMonths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter days");
        int days = sc.nextInt();
        int months = days / 30;
        int remainingDays = days % 30;
        System.out.println(months + " month");
        System.out.println(remainingDays + " days");
        sc.close();
    }
}

// ---- Task 5: BMI Calculator ----
class Task5_BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in pounds");
        double weight = sc.nextDouble();
        double kilogram = weight * 0.45359237;
        System.out.println("Enter height in inches");
        double height = sc.nextDouble();
        double meters = height * 0.0254;
        double bmi = kilogram / (meters * meters);
        System.out.println("Your BMI is " + bmi);
        sc.close();
    }
}
