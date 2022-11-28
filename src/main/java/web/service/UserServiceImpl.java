package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.models.User;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    @Autowired
    public void UserServiceImp (UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Transactional
    @Override
    public User show(int id) {
        return userDAO.show(id);
    }
    @Transactional
    @Override
    public List<User> countUsers(int count) {
        return userDAO.countUsers(count);
    }
    @Transactional
    @Override
    public void save(User user) {
        userDAO.save(user);
    }
    @Transactional
    @Override
    public User update(int id, User updateUser) {
        return userDAO.update(id, updateUser);
    }
    @Transactional
    @Override
    public void delete(int id) {
        userDAO.delete(id);
    }
}
