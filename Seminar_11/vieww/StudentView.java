package Seminar_11.vieww;

import java.util.List;

import Seminar_11.controllerr.Controller;
import Seminar_11.modell.User;

public class StudentView {
    private Controller controller = new Controller();

    public void UserList(User user) {
        controller.UserList(user);
        System.out.println("Студент " + user + "добавлен");
    }

    public List<User> getUserList() {
        return controller.getUserList("student");

    }

}