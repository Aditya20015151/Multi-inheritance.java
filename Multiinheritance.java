package multiinheritance;
import java.util.*;

public class Multiinheritance {
	
	static class Person {
        String name;
        int age;

        void see() {
            System.out.println("Name is: " + name);
            System.out.println("Age is: " + age);
        }
    }

    // Interface 1
    interface Employee {
        void id();
    }

    // Interface 2
    interface Student {
        void study();
    }

   
    static class Child extends Person implements Employee, Student {
        int Employee_id;

        public void id() {
            System.out.println("Employee id is: " + Employee_id);
        }

        public void study() {
            System.out.println(name + " is studying.");
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Child p = new Child();

        System.out.print("Enter name: ");
        p.name = sc.nextLine();

        System.out.print("Enter age: ");
        p.age = sc.nextInt();

        System.out.print("Enter Employee ID: ");
        p.Employee_id = sc.nextInt();

        System.out.println();

        p.see();
        p.id();
        p.study();

        sc.close();
    }
}
