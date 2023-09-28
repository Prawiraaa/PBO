public class Q14Student {
    // Define properties/fields
    private String name;
    private String studentID;
    private String degreeProgram;

    // Constructor
    public Q14Student(String name, String studentID, String degreeProgram) {
        this.name = name;
        this.studentID = studentID;
        this.degreeProgram = degreeProgram;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    // toString method
    @Override
    public String toString() {
        return "[" + name + ", ID: " + studentID + ", " + degreeProgram + "]";
    }
}