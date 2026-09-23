import java.util.*;

class Student {
    String name;
    int[] marks = new int[6];
    double percentage;

    // Constructor
    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;

        int total = 0;

        for (int i = 0; i < 6; i++) {
            total = total + marks[i];
        }

        percentage = (total / 600.0) * 100;
    }
}

public class Highest2StudMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter student name: ");
            String name = sc.next();

            int[] marks = new int[6];
            System.out.println("Enter marks of 6 subjects:");
            for (int j = 0; j < 6; j++) {
                marks[j] = sc.nextInt();
            }
            students[i] = new Student(name, marks);
        }
        for (int i = 0; i < 2; i++)
        {
            int maxIndex = i;
            for (int j = i + 1; j < 5; j++) {
                if (students[j].percentage > students[maxIndex].percentage) {
                    maxIndex = j;
                }
            }
            Student temp = students[i];
            students[i] = students[maxIndex];
            students[maxIndex] = temp;
        }
        System.out.println("\nTop 2 Students:");

        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + ". " + students[i].name + " - " + students[i].percentage + "%");
        }
    }
}
//class test{
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter student age:");
//        int age = sc.nextInt();
//
//        sc.nextLine();
//        System.out.print("Enter student name:");
//        String name=sc.nextLine();
//        System.out.print("Student age:" +age + ", name:" + name);
//
//    }
//}


