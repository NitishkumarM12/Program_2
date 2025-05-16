package program2;
class student {
    private String name;
    private int rollNumber;
    private String course;
    private String branch;

    public student(String name, int rollNumber, String course, String branch) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
        this.branch = branch;
    }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
        System.out.println("Branch: " + branch);
    }
}
public class Date{
    public static void main(String[] args) {
        student stud = new student("Alice", 101, "Computer Science", "AI");
        stud.display();
    }
}

