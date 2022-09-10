package Dao;

import Model.User;

import java.util.ArrayList;

public class UserDao {
    private ArrayList<User> users = new ArrayList<>();

    public UserDao() {
    }

    public void addUser(User user){
        users.add(user);

    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    public void getAllUsers(){
        for (User user:users) {
            System.out.println("Name: " + user.getName());
            System.out.println("Age: " + user.getAge());
            System.out.println("Gender: " + user.getGender());
            System.out.println("Id: " + user.getId());
            System.out.println("-------------------------------");
        }
    }
}
