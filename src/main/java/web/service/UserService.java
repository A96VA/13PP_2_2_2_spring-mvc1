package web.service;

import org.springframework.web.bind.annotation.PathVariable;
import web.models.User;

import java.util.List;



public interface UserService {


    public List<User> getUser(int id);
    public User show(int id);
    public List<User> countUsers(int count);
    public void save(User user);
    public void update(int id, User updateUser);
    public void delete(int id);
}
