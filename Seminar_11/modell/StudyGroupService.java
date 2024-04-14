package Seminar_11.modell;

import java.util.List;

public class StudyGroupService {
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        StudyGroup studyGroup = new StudyGroup(teacher);
        for (Student student : students) {
            studyGroup.addStudent(student);
        }
        return studyGroup;
    }
}
