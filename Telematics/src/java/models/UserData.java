package models;

import java.util.ArrayList;
import java.util.Arrays;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean (name="userData", eager=true)
@SessionScoped
public class UserData {

    private String name, lastname, id, username, password, email;

    private static final ArrayList<User> userList = new ArrayList<User>(Arrays.asList(new User("Steven", "Bedoya", "13456", "stbedoya", "qwerty", "stbedoya@email.com"),
            new User("Johana", "Moreno", "6547891", "joamoreno", "uniajc", "joamoreno@email.com"),
            new User("Alejandra", "Bedoya", "123456789", "alebedoya", "bennett", "alebedoya@email.com")
    ));

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void addUser() {
        User user = new User(name, lastname, id, username, password, email);
        userList.add(user);
    }

    public void deleteUser(User user) {
        userList.remove(user);
    }

    public void editUser(User user) {
        user.setEdit(true);
    }

    public void saveUser() {
        for (User user : userList) {
            user.setEdit(false);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
