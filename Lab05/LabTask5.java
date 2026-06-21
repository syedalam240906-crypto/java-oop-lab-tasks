// ============================================
// OOP LAB TASK 5 - Constructors
// Name: Syed Amaan
// University: IoBM - BS Data Science
// ============================================

import java.util.Scanner;

// ---- Q1: Constructor to Initialize Car Brand ----
class Q1_Car {
    String brand;

    Q1_Car() {
        brand = "Ford";
    }

    String getBrand() {
        return brand;
    }

    public static void main(String[] args) {
        Q1_Car c = new Q1_Car();
        String b = c.getBrand();
        System.out.println("Brand is " + b);
    }
}

// ---- Q2: Circle Class with No-Arg and Parameterized Constructors ----
class Q2_Circle {
    double radius;

    // No-argument constructor sets radius to 1
    Q2_Circle() {
        radius = 1;
    }

    // Parameterized constructor
    Q2_Circle(double r) {
        radius = r;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    void printDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        Q2_Circle c1 = new Q2_Circle(10);
        Q2_Circle c2 = new Q2_Circle(10.2);
        Q2_Circle c3 = new Q2_Circle(12.0);

        System.out.println("Circle 1:");
        c1.printDetails();

        System.out.println("Circle 2:");
        c2.printDetails();

        System.out.println("Circle 3:");
        c3.printDetails();
    }
}

// ---- Q3: Parameterized Constructor for Student Details ----
class Q3_Student {
    String name;
    int id;
    double GPA;

    // Parameterized Constructor
    Q3_Student(String n, int i, double g) {
        name = n;
        id = i;
        GPA = g;
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("GPA: " + GPA);
    }

    public static void main(String[] args) {
        Q3_Student s = new Q3_Student("Ali", 101, 3.9);
        s.printDetails();
    }
}

// ---- Q4: Find Maximum of Three Numbers ----
class Q4_FindMax {
    static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Input the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Input the third number: ");
        int num3 = sc.nextInt();

        int result = findMax(num1, num2, num3);
        System.out.println("Maximum number is: " + result);
        sc.close();
    }
}

// ---- Q5: getTotal Method with Constructor ----
class Q5_Calculate {
    int num1;
    int num2;

    // Constructor
    Q5_Calculate(int a, int b) {
        num1 = a;
        num2 = b;
    }

    // Method to return sum
    int getTotal() {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Q5_Calculate c = new Q5_Calculate(15, 25);
        int result = c.getTotal();

        System.out.println("First Number: " + c.num1);
        System.out.println("Second Number: " + c.num2);
        System.out.println("Total: " + result);
    }
}
