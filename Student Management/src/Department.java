import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Department {
    private Set<Subject> courses;
    private ArrayList<User> users;

    public Department() {
        this.courses = new HashSet<>();
        this.users = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        if (!courses.contains(subject)) this.courses.add(subject);
    }

    public void addTeacher(Teacher teacher) {
        if (!users.contains(teacher)) this.users.add(teacher);
    }

    public void addStudent(Student student) {
        if (!users.contains(student)) {
            users.add(student);
        }
    }

    public void assignTeacherToCourse(Teacher teacher, Subject course) {
        if (users.contains(teacher) && courses.contains(course)) {
            teacher.getTakenCourse().put(course.getCourseName(), 0);
        }
    }

    public void enrollStudentToCourse(Student student, Subject course) {
        if (users.contains(student) && courses.contains(course)) {
            student.getEnrolledCourse().add(course);
            student.setCreditCount(student.getCreditCount() + course.getAmountOfCredits());
        }
    }

    public void putGrade(Student student, String courseName, int grade) {
        if (users.contains(student)) {
            student.getMarks().put(courseName, grade);
        }
    }

    public Teacher findTeacherById(Integer id) {
        return users.stream()
                .filter(user -> user instanceof Teacher)
                .filter(user -> user.getId() == id)
                .map(user -> (Teacher) user)
                .findFirst()
                .orElse(null);
    }

    public Student findStudentById(Integer id) {
        return users.stream()
                .filter(user -> user instanceof Student)
                .filter(user -> user.getId() == id)
                .map(user -> (Student) user)
                .findFirst()
                .orElse(null);
    }

    public Subject findSubjectByName(String courseName) {
        return courses.stream()
                .filter(course -> course.getCourseName().equals(courseName))
                .findFirst()
                .orElse(null);
    }

    public void printAllSubjects() {
        System.out.println("All subjects:");
        courses.forEach(System.out::println);
    }

    public void printAllStudents() {
        System.out.println("All students:");
        users.stream()
                .filter(user -> user instanceof Student)
                .forEach(System.out::println);
    }

    public void printAllTeachers() {
        System.out.println("All teachers:");
        users.stream()
                .filter(user -> user instanceof Teacher)
                .forEach(System.out::println);
    }
}
