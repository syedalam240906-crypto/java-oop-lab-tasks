// ============================================
// OOP LAB TASK 2 - Java Basics & Type Casting
// Name: Syed Amaan
// University: IoBM - BS Data Science
// ============================================

import java.util.Scanner;

// ---- Task 1: BMI Calculator with Weight Categories ----
class Task1_BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write detail of your bmi");
        System.out.println("Enter weight in kg");
        int weight = sc.nextInt();
        System.out.println("Enter height in meter");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println(bmi + " Here is your bmi");
        if (bmi < 18.5) {
            System.out.println("Under weight");
        } else if (bmi <= 24.9) {
            System.out.println("Healthy weight");
        } else if (bmi <= 29.9) {
            System.out.println("Over weight");
        } else {
            System.out.println("Obese");
        }
        sc.close();
    }
}

// ---- Task 2: Random Number to Corresponding Character ----
class Task2_NumberToCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number (1-25)");
        int number = sc.nextInt();
        if (number > 26) {
            System.out.println("Invalid");
        } else {
            char ch = (char) ('A' + number - 1);
            System.out.println("The number is " + number);
            System.out.println("The alphabet is " + ch);
        }
        sc.close();
    }
}

// ---- Task 3: Distance Light Travels in 1000 Days ----
class Task3_LightDistance {
    public static void main(String[] args) {
        int days = 1000;
        double speed = 186000;
        double second = days * 24 * 60 * 60;
        double distance = speed * second;
        System.out.println("In " + days + " days");
        System.out.println("Light will travel around");
        System.out.println(distance + " miles");
    }
}

// ---- Task 4: Convert Minutes to Years ----
class Task4_MinutesToYears {
    public static void main(String[] args) {
        int minutes = 525600;
        int minuteInYears = 60 * 24 * 365;
        int year = minutes / minuteInYears;
        System.out.println(minutes + " minutes is approx");
        System.out.println(minuteInYears + " minutes in a year");
        System.out.println(year + " year");
    }
}

// ---- Task 5: Fahrenheit to Celsius ----
class Task5_FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fahrenheit");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in celsius: " + celsius);
        sc.close();
    }
}

// ---- Task 6: Calvin Paintings Earnings in Rupees ----
class Task6_PaintingEarnings {
    public static void main(String[] args) {
        double largePrice = 56.25;
        double smallPrice = 25.80;
        int largeSold = 6;
        int smallSold = 3;
        double totalDollars = (largePrice * largeSold) + (smallPrice * smallSold);
        double exchangeRate = 83; // 1 dollar = 83 rupees
        double totalRupees = totalDollars * exchangeRate;
        System.out.println("Total earnings in rupees: Rs." + totalRupees);
    }
}
