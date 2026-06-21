// ============================================
// OOP LAB TASK 4 - Classes and Objects
// Name: Syed Amaan
// University: IoBM - BS Data Science
// ============================================

import java.util.Scanner;

// ---- Q1: Student Class with Two Objects ----
class Q1_Student {
    String name;
    int rollno;
    String address;
    String phonenumber;

    public static void main(String[] args) {
        Q1_Student s1 = new Q1_Student();
        s1.name = "Babar";
        s1.rollno = 36567;
        s1.address = "Karachi";
        s1.phonenumber = "123456";

        Q1_Student s2 = new Q1_Student();
        s2.name = "Danish";
        s2.rollno = 48789;
        s2.address = "Islamabad";
        s2.phonenumber = "345678";

        System.out.println("Student 1");
        System.out.println(" Name: " + s1.name);
        System.out.println(" Roll No: " + s1.rollno);
        System.out.println(" Address: " + s1.address);
        System.out.println(" Phone Number: " + s1.phonenumber);

        System.out.println("Student 2");
        System.out.println(" Name: " + s2.name);
        System.out.println(" Roll No: " + s2.rollno);
        System.out.println(" Address: " + s2.address);
        System.out.println(" Phone Number: " + s2.phonenumber);
    }
}

// ---- Q2: Add Two Distances in Feet and Inches ----
class Q2_AddDistance {
    int feet, inches;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter feet: ");
        feet = sc.nextInt();
        System.out.print("Enter inches: ");
        inches = sc.nextInt();
    }

    void addDistance(Q2_AddDistance d1, Q2_AddDistance d2) {
        inches = d1.inches + d2.inches;
        feet = d1.feet + d2.feet;
        if (inches >= 12) {
            feet = feet + (inches / 12);
            inches = inches % 12;
        }
    }

    void display() {
        System.out.println("Total Distance = " + feet + " feet " + inches + " inches");
    }

    public static void main(String[] args) {
        Q2_AddDistance d1 = new Q2_AddDistance();
        Q2_AddDistance d2 = new Q2_AddDistance();
        Q2_AddDistance result = new Q2_AddDistance();
        System.out.println("Enter First Distance:");
        d1.getData();
        System.out.println("Enter Second Distance:");
        d2.getData();
        result.addDistance(d1, d2);
        result.display();
    }
}

// ---- Q3: Employee Class with 5 Employees ----
class Q3_Employ {
    String name;
    int id;
    String address;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Address: " + address);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Q3_Employ emp[] = new Q3_Employ[5];
        for (int i = 0; i < 5; i++) {
            emp[i] = new Q3_Employ();
            System.out.println("Enter details for Employee " + (i + 1));
            emp[i].getData();
        }
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < 5; i++) {
            emp[i].display();
        }
    }
}

// ---- Q4: Average Class to Calculate Average of Three Numbers ----
class Q4_Average {
    void calculateAverage() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();
        double avg = (num1 + num2 + num3) / 3;
        System.out.println("Average = " + avg);
        sc.close();
    }

    public static void main(String[] args) {
        Q4_Average obj = new Q4_Average();
        obj.calculateAverage();
    }
}
