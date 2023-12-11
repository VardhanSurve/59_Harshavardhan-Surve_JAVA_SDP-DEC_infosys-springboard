public class StudentTester{
    // Private member variables
    private String studentName;
    private int studentId;
    private double qualifyingMarks;
    private int yearOfEngineering;
    private char residentialStatus; // 'H' for hosteller, 'D' for day scholar

    // Getter and Setter methods for studentName
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Getter and Setter methods for studentId
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // Getter and Setter methods for qualifyingMarks
    public double getQualifyingMarks() {
        return qualifyingMarks;
    }

    public void setQualifyingMarks(double qualifyingMarks) {
        this.qualifyingMarks = qualifyingMarks;
    }

    // Getter and Setter methods for yearOfEngineering
    public int getYearOfEngineering() {
        return yearOfEngineering;
    }

    public void setYearOfEngineering(int yearOfEngineering) {
        this.yearOfEngineering = yearOfEngineering;
    }

    // Getter and Setter methods for residentialStatus
    public char getResidentialStatus() {
        return residentialStatus;
    }

    public void setResidentialStatus(char residentialStatus) {
        this.residentialStatus = residentialStatus;
    }

    // Display method to show student details
    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Qualifying Marks: " + qualifyingMarks);
        System.out.println("Year of Engineering: " + yearOfEngineering);
        System.out.println("Residential Status: " + residentialStatus);
    }

    public static void main(String[] args) {
        // Creating an object of the Student class
        StudentTester student1 = new StudentTester();

        // Using setter methods to set values
        student1.setStudentId(1);
        student1.setStudentName("Aditya Biradar");
        student1.setQualifyingMarks(75.5);
        student1.setYearOfEngineering(3);
        student1.setResidentialStatus('H');

        // Using display method to show all details
        student1.displayStudentDetails();
    }
}
