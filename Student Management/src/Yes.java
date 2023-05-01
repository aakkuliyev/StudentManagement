public class Yes implements Transferable {
    @Override
    public void check(Student s) {
        if (s.getYearOfStudy() < 4) {
            s.setYearOfStudy(s.getYearOfStudy() + 1);
            s.setCreditCount(0);
        } else {
            System.out.println("It is impossible to transfer this student to the next year.");
        }
    }
}
