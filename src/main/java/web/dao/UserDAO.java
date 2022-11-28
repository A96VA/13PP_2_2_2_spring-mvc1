package web.dao;

import web.models.User;

import java.util.List;



public interface UserDAO {

    User show(int id);                       //вывод одного

    List<User> countUsers(int count);        // вывод всех или несколько

    void save(User user);                    // добавление

    User update(int id, User updateUser);   // изменение

    void delete(int id);                     // удаление
}
