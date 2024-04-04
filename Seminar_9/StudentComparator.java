package Seminar_9;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        String t1 = o1.getName() + o1.getId();
        String t2 = o2.getName() + o2.getId();
        return t1.compareTo(t2);
    }
}
