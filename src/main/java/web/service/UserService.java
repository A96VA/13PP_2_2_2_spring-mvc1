package web.service;

import web.models.User;

import java.util.List;



public interface UserService {
    public List<User> getUser();
    public List<User> countUsers(int count);
    public void save(User user);
}
