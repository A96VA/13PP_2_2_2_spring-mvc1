package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;



@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public User show(int id){
        return entityManager.find(User.class, id);
    }

    @Override
    public List<User> countUsers(int count) {

        TypedQuery<User> query = entityManager.createQuery("FROM User", User.class);
        return query.getResultList();
    }
    public void save(User user){
        entityManager.persist(user);
    }

    @Override
    public User update(int id, User updateUser) {
        User userUp = entityManager.find(User.class, id);
        userUp.setNomer(updateUser.getNomer());
        userUp.setNameUs(updateUser.getNameUs());
        userUp.setLastNameUs(updateUser.getLastNameUs());
        return entityManager.merge(userUp);
    }

    @Override
    public void delete(int id) {
        User userDel = entityManager.find(User.class, id);
        entityManager.remove(userDel);
    }


}
