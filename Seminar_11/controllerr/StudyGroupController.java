package Seminar_11.controllerr;

import java.util.List;

import HomeWorkStudent.StudyGroup;
import Seminar_11.modell.Student;
import Seminar_11.modell.StudyGroupService;
import Seminar_11.modell.Teacher;

public class StudyGroupController {
    private StudyGroupService service = new StudyGroupService();

    public Seminar_11.modell.StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return service.createStudyGroup(teacher, students);
    }
}

