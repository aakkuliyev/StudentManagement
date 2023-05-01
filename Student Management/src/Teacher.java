import java.util.HashMap;

public class Teacher extends User{
    private HashMap<String, Integer> takenCourse;

    public Teacher(String name, String surname, int id) {
        super(name, surname, id);
        this.takenCourse = new HashMap<>();
    }

    public HashMap<String, Integer> getTakenCourse() {
        return takenCourse;
    }

    public void setTakenCourse(HashMap<String, Integer> takenCourse) {
        this.takenCourse = takenCourse;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "takenCourse=" + takenCourse +
                '}';
    }
}
