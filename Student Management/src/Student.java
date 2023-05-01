import java.util.ArrayList;
import java.util.HashMap;

public class Student extends User{
    private String group;
    private int yearOfStudy;
    private int creditCount = 0;
    private Transferable transfer;
    private ArrayList<Subject> enrolledCourse;
    private ArrayList<Subject> pastCourses;
    private HashMap<String, Integer> marks;

    public Student(String name, String surname, int id, String group, int yearOfStudy, int creditCount) {
        super(name, surname, id);
        this.group = group;
        this.yearOfStudy = yearOfStudy;
        this.creditCount = creditCount;
        this.enrolledCourse = new ArrayList<>();
        this.pastCourses = new ArrayList<>();
        this.marks = new HashMap<>();
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getCreditCount() {
        return creditCount;
    }

    public void setCreditCount(int creditCount) {
        this.creditCount = creditCount;
    }

    public Transferable getTransfer() {
        return transfer;
    }

    public void setTransfer(Transferable transfer) {
        this.transfer = transfer;
    }

    public ArrayList<Subject> getEnrolledCourse() {
        return enrolledCourse;
    }

    public void setEnrolledCourse(Subject enrolledCourse) {
        this.enrolledCourse.add(enrolledCourse);
    }

    public ArrayList<Subject> getPastCourses() {
        return pastCourses;
    }

    public void setPastCourses(ArrayList<Subject> pastCourses) {
        this.pastCourses = pastCourses;
    }

    public HashMap<String, Integer> getMarks() {
        return marks;
    }

    public void setMarks(HashMap<String, Integer> marks) {
        this.marks = marks;
    }

    public void transfer() {
        double average = marks.values().stream().mapToInt(Integer::intValue).average().orElse(0.0);
        if (average > 50 && creditCount == 20) {
            transfer = new Yes();
        } else {
            transfer = new No();
        }
        transfer.check(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "group='" + group + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", creditCount=" + creditCount +
                ", transfer=" + transfer +
                ", enrolledCourse=" + enrolledCourse +
                ", pastCourses=" + pastCourses +
                ", marks=" + marks +
                '}';
    }
}
