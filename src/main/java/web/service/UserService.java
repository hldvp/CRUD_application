package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public User getUserById(long id);
    public void creatUser(User user);
    public void updateUser(User user);
    public void deleteUser(long id);
}
