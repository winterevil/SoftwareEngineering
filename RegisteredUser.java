import java.util.List;

public class RegisteredUser {
    private List<User> users;

    public RegisteredUser() {
    }

    public RegisteredUser(List<User> users) {
        this.users = users;
    }

    public boolean addUser(User user) {
        return users.add(user);
    }

    public boolean removeUser(User user) {
        return users.remove(user);
    }
}