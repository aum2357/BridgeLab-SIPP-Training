public class Course {
    // Instance Variables
    private String courseName;
    private int duration; // in weeks
    private double fee;
    // Class Variable
    private static String instituteName = "OpenAI Academy";
    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    // Instance Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName +
                           ", Duration: " + duration + " weeks" +
                           ", Fee: $" + fee +
                           ", Institute: " + instituteName);
    }
    // Class Method to update institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
    // Main Method for Testing
    public static void main(String[] args) {
        // Creating Course instances
        Course c1 = new Course("Java Programming", 8, 500.0);
        Course c2 = new Course("Data Structures", 6, 450.0);
        // Display details before updating institute name
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        // Update the institute name
        Course.updateInstituteName("AI Learning Center");
        // Display details after update
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
