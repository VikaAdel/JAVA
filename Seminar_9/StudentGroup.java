package Seminar_9;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.Iterator;

public class StudentGroup implements Iterable<Student> {

    private List<Student> students;

    public StudentGroup() {
        this.students = new ArrayList<>();

    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudent(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;

    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(students);
    }

}

class StudentGroupIterator implements Iterator<Student> {

    List<Student> students = new ArrayList<>();
    private int index = 0;

    public StudentGroupIterator(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return index < students.size();
    }

    @Override
    public Student next() {
        return students.get(index++);
    }
}