import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, you're in the Student Management System!");
        Department department = new Department();

        System.out.println("Let's do some operations with our code!" + '\n' +
                "Please, choose the number");
        System.out.println("1. Create subjects and add them to the department.");
        System.out.println("2. Create teachers and add them to the department.");
        System.out.println("3. Create students and add them to the department.");
        System.out.println("4. Assign teachers to the subject.");
        System.out.println("5. Enroll students to the subject.");
        System.out.println("6. Assign grades to the student.");
        System.out.println("7. Print info about department, subjects, teachers and students");
        System.out.println("8. Transferring of student");

        int choice = sc.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("Creating subjects ...");
                Subject math = new Subject("Math", 5, 0);
                Subject english = new Subject("English", 3, 0);
                Subject history = new Subject("History", 4, 0);
                department.addSubject(math);
                department.addSubject(english);
                department.addSubject(history);

                System.out.println("We add some subjects such as Math, English, History. You may add by writing <Yes> if you want");
                String choice1 = sc.next();
                if (choice1.equals("Yes"))
                {
                    System.out.println("CourseName:");
                    String courseName = sc.next();
                    System.out.println("Amount of credits:");
                    int amountOfCredits = sc.nextInt();
                    Subject subject = new Subject(courseName, amountOfCredits, 0);
                    department.addSubject(subject);
                }
            case 2:
                System.out.println("Creating teachers...");
                Teacher teacher1 = new Teacher("John", "Smith", 1001);
                Teacher teacher2 = new Teacher("Jane", "Doe", 1002);
                department.addTeacher(teacher1);
                department.addTeacher(teacher2);

                System.out.println("We add some teachers. You may add by writing <Yes> if you want");
                String choice2 = sc.next();
                if (choice2.equals("Yes"))
                {
                    System.out.println("Name:");
                    String nameTeacher = sc.next();
                    System.out.println("Surname:");
                    String surnameTeacher = sc.next();
                    System.out.println("ID:");
                    int idTeacher = sc.nextInt();

                    Teacher teacher3 = new Teacher(nameTeacher, surnameTeacher, idTeacher);
                    department.addTeacher(teacher3);
                }
            case 3:
                System.out.println("Creating students...");
                Student student1 = new Student("Alice", "Johnson", 2001, "Group1", 1, 30);
                Student student2 = new Student("Bob", "Williams", 2002, "Group1", 1, 48);
                department.addStudent(student1);
                department.addStudent(student2);

                System.out.println("We add some student. You may add by writing <Yes> if you want");
                String choice3 = sc.next();
                if (choice3.equals("Yes"))
                {
                    System.out.println("Name:");
                    String nameStudent = sc.next();
                    System.out.println("Surname:");
                    String surnameStudent = sc.next();
                    System.out.println("ID:");
                    int idStudent = sc.nextInt();
                    System.out.println("Group:");
                    String groupStudent = sc.next();
                    System.out.println("Year of study:");
                    int yearOfStudentStudent = sc.nextInt();
                    System.out.println("Amount of credits:");
                    int creditCountStudent = sc.nextInt();

                    Student student3 = new Student(nameStudent, surnameStudent, idStudent, groupStudent, yearOfStudentStudent, creditCountStudent);
                    department.addStudent(student3);
                }
            case 4:
                System.out.println("Assigning teacher to the course");
                System.out.println("Write a courseName:");
                String findCourseName_forAssigning = sc.next();

                System.out.println("Write a teacher Id:");
                int findTeacher_forAssigning = sc.nextInt();

                department.assignTeacherToCourse(department.findTeacherById(findTeacher_forAssigning), department.findSubjectByName(findCourseName_forAssigning));
                break;
            case 5:
                System.out.println("Enrolling student to the course");
                System.out.println("Write a courseName:");
                String findCourseName_forEnrolling = sc.next();

                System.out.println("Write a student Id:");
                int findStudent_forEnrolling = sc.nextInt();
                department.enrollStudentToCourse(department.findStudentById(findStudent_forEnrolling), department.findSubjectByName(findCourseName_forEnrolling));
                break;
            case 6:
                System.out.println("Assigning grades to the student");
                System.out.println("Write a courseName:");
                String findCourseName_forGrading = sc.next();

                System.out.println("Write a student Id:");
                int findStudent_forGrading = sc.nextInt();

                System.out.println("Write the grade:");
                int grade = sc.nextInt();

                department.putGrade(
                        department.findStudentById(findStudent_forGrading),
                        findCourseName_forGrading,
                        grade
                );
                break;
            case 7:
                System.out.println("Printing all info about teachers...");
                System.out.println("Subjects:");
                department.printAllSubjects();
                System.out.println("Teachers:");
                department.printAllTeachers();
                System.out.println("Student:");
                department.printAllStudents();
                break;
            case 8:
                System.out.println("Checking for transfer...");
                System.out.println("Student id:");
                int idStudent_forTransferring = sc.nextInt();

                Student studentForTransferring = department.findStudentById(idStudent_forTransferring);
                if (studentForTransferring != null) {
                    studentForTransferring.transfer();
                } else {
                    System.out.println("Student not found.");
                }
                break;
        }
    }
}