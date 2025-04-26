// Base class
class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass Teacher
class Teacher extends Person {
    String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age); // Call constructor of Person
        this.subject = subject;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call method from Person
        System.out.println("Subject: " + subject);
    }
}

// Subclass Student
class Student extends Person {
    String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        super(name, age); // Call constructor of Person
        this.grade = grade;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call method from Person
        System.out.println("Grade: " + grade);
    }
}

// Main class to run the example
public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith", 40, "Physics");
        Student student = new Student("Emily", 17, "12th");

        System.out.println("Teacher Info:");
        teacher.displayInfo();

        System.out.println("\nStudent Info:");
        student.displayInfo();
    }
}


//output 
//Teacher Info:
//Name: Mr. Smith
//Age: 40
//Subject: Physics

//Student Info:
//Name: Emily
//Age: 17
//Grade: 12th
