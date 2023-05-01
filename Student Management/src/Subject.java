public class Subject {
    private String courseName;
    private int amountOfCredits;
    private int amountOfEnrolledStudents;

    public Subject(String courseName, int amountOfCredits, int amountOfEnrolledStudents) {
        this.courseName = courseName;
        this.amountOfCredits = amountOfCredits;
        this.amountOfEnrolledStudents = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getAmountOfCredits() {
        return amountOfCredits;
    }

    public void setAmountOfCredits(int amountOfCredits) {
        this.amountOfCredits = amountOfCredits;
    }

    public int getAmountOfEnrolledStudents() {
        return amountOfEnrolledStudents;
    }

    public void setAmountOfEnrolledStudents(int amountOfEnrolledStudents) {
        this.amountOfEnrolledStudents = amountOfEnrolledStudents;
    }


    @Override
    public String toString() {
        return "Subject{" +
                "courseName='" + courseName + '\'' +
                ", amountOfCredits=" + amountOfCredits +
                ", amountOfEnrolledStudents=" + amountOfEnrolledStudents +
                '}';
    }
}
