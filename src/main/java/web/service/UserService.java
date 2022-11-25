package web.service;

import web.models.User;

import java.util.List;



public interface UserService {


    public List<User> getUser(int id);
    public User show(int id);
    public List<User> countUsers(int count);
    public void save(User user);
    public void update(int id, User updateUser);
}
