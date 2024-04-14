package Seminar_11;



import java.util.ArrayList;
import java.util.List;

import HomeWorkStudent.StudyGroup;
import Seminar_11.modell.Student;
import Seminar_11.modell.Teacher;
import Seminar_11.vieww.StudyGroupView;

public class Main {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Иванов Иван Иванович", 35, "Math");
    
        Student student1 = new Student("Иванов Иван", 19, 123);
        Student student2 = new Student("Петров Максим", 10, 124);
        Student student3 = new Student("Легкова Марина", 19, 125);
        Student student4 = new Student("Пряникова Мария", 20, 126);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        StudyGroupView studyGroupView = new StudyGroupView();
        Seminar_11.modell.StudyGroup studyGroup = studyGroupView.createStudyGroup(teacher, students);

        studyGroupView.displayStudyGroup(studyGroup);
    }
}