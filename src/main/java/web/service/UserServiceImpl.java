package web.service;

import org.springframework.stereotype.Service;
import web.models.User;
import java.util.ArrayList;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    private static int AUTO_ID;
    private List<User> userList;

    {
        userList = new ArrayList<>();
        userList.add(new User(++AUTO_ID,123, "Ivan", "Ivans"));
        userList.add(new User(++AUTO_ID,234, "Petr", "Petrs"));
        userList.add(new User(++AUTO_ID,345, "Mike", "Mikes"));
        userList.add(new User(++AUTO_ID,456, "Nik", "Nikes"));
        userList.add(new User(++AUTO_ID,567, "Stiv", "Jobs"));
        userList.add(new User(++AUTO_ID,678, "Yan", "Ins"));
    }
    @Override
    public List<User> getUser() {
       return userList;
    }

    @Override
    public List<User> countUsers(int count) {
       List<User> countUsers = new ArrayList<>();
        if (count >= userList.size()){
            return userList;
        } else {
            for (int i = 0; i <= count-1; i++){
                countUsers.add(userList.get(i));
            }
            return countUsers;
        }
    }
    public void save(User user){
        userList.add(user);
    }
}
