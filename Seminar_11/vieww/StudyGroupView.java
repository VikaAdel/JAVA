package Seminar_11.vieww;

import java.util.List;

import HomeWorkStudent.StudyGroup;
import Seminar_11.controllerr.StudyGroupController;
import Seminar_11.modell.Student;
import Seminar_11.modell.Teacher;

public class StudyGroupView {
    private StudyGroupController controller = new StudyGroupController();

    public Seminar_11.modell.StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return controller.createStudyGroup(teacher, students);
    }

    public void displayStudyGroup(Seminar_11.modell.StudyGroup studyGroup) {
        Teacher teacher = studyGroup.getTeacher();
        List<Student> students = studyGroup.getStudents();

        System.out.println("Teacher: " + teacher);
        System.out.println("Students: ");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
