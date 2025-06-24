public class Student {
    // Access Modifiers
    public int rollNumber;       // public
    protected String name;       // protected
    private double CGPA;         // private
    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    // Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}
class PostgraduateStudent extends Student {

    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name (protected): " + name);
        System.out.println("CGPA: " + getCGPA());
    }
    public void updateCGPA(double newCGPA) {
        setCGPA(newCGPA);
    }
    public static void main(String[] args) {
        PostgraduateStudent pgStudent = new PostgraduateStudent(101, "Alice", 3.85);
        System.out.println("Before CGPA Update:");
        pgStudent.displayDetails();
        pgStudent.updateCGPA(3.95);
        System.out.println("\nAfter CGPA Update:");
        pgStudent.displayDetails();
    }
}
