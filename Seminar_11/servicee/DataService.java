package Seminar_11.servicee;

import java.util.ArrayList;
import java.util.List;

import Seminar_11.modell.Student;
import Seminar_11.modell.Teacher;
import Seminar_11.modell.User;

public class DataService {

    private List<User> student = new ArrayList<>();
    private List<User> teacher = new ArrayList<>();

    public void UserList(User user) {
        if (user instanceof Student) {
            student.add(user);
        } else if (user instanceof Teacher) {
            teacher.add(user);
        }
    }

    public List<User> getUserList(String type) {
        if (type.equals("student")) {
            return student;
        } else if (type.equals("teacher")) {
            return teacher;
        }
        return null;
    }
}