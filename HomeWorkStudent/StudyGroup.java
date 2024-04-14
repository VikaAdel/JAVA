package HomeWorkStudent;

import java.util.ArrayList;
import java.util.List;

import Seminar_11.modell.Teacher;

import java.util.*;
import java.util.Iterator;

public class StudyGroup  {
    private List<Student> students;

    public StudyGroup() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public int getStudentCount() {
        return students.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Study Group:\n");
        for (Student student : students) {
            sb.append(student.toString()).append("\n");
        }
        return sb.toString();
    }

    public Teacher getTeacher() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTeacher'");
    }
}
