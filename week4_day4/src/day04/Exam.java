package day04;

public class Exam {
    public <T extends Comparable> T findLarger(T x, T y) {
        if (x.compareTo(y) > 0) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {
        Exam t = new Exam();
        Object x = t.findLarger(123, "456");
//        String y = t.findLarger("java", 123);
//        int z = t.findLarger(123, new Integer(456));
//        int a = (int) (t.findLarger(new Double(123), new Double(456)));
    }
}