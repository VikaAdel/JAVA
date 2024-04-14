package Seminar_11.controllerr;

import java.util.List;

import Seminar_11.modell.User;
import Seminar_11.servicee.DataService;

public class Controller {

    DataService service = new DataService();

    public void UserList(User user) {
        service.UserList(user);
    }

    public List<User> getUserList(String type) {
        return service.getUserList(type);
    }
}
