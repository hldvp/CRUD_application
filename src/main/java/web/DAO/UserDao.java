package web.DAO;

import web.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();
    public User getUserById(long id);
    public void creatUser(User user);
    public void updateUser(User user);
    public void deleteUser(long id);
}
