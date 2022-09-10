import Dao.UserDao;
import Model.Gender;
import Model.User;
import impl.userServiceImpl;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1,"Bakai",32, Gender.MALE);
        User user2 = new User(2,"Syimyk",21, Gender.MALE);
        User user3 = new User(3,"Samarbek",34, Gender.MALE);
        UserDao userDao = new UserDao();
        userServiceImpl userService = new userServiceImpl(userDao);
        userService.addUser(user1);
        userService.addUser(user2);
        userService.addUser(user3);
        userService.srchUser(5);
        System.out.println("-----------Bardyk userler----------------");
        userService.getUsers();
        userService.removeUser(1);
        System.out.println("--------Kalgan userler--------------------");
        userService.getUsers();



}}

