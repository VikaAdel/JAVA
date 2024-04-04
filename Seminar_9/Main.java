package Seminar_9;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        StudentGroup group = new StudentGroup();
        group.addStudent(new Student("Adel", 100));
        group.addStudent(new Student("Vika", 101));
        group.addStudent(new Student("Evgenii", 102));

        for (Student student : group) {
            System.out.println(student.getName());
        }

        System.out.println(group.getStudent("Adel").compareTo(group.getStudent("Vika")));

        TreeSet<Student> set = new TreeSet<>(new StudentComparator());
            set.add(group.getStudent("Adel"));
            set.add(group.getStudent("Vika"));
            set.add(group.getStudent("Evgenii"));
        // for (Student student : set) {
        //     set.add(student);
        // }
        System.out.println(set);

        Iterator<Student> iterator = group.iterator();
        while (iterator.hasNext()) {

            Student student = iterator.next();
            if (student.getName().equals("Adel")) {
                group.removeStudent(student);
            }
        }

        for (Student student : group) {
            System.out.println(student.getName());
        }
    }
}