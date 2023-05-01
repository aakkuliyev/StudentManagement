public class No implements Transferable {
    @Override
    public void check(Student s) {
        System.out.println("It is impossible to transfer this student to the next year.");
    }
}
