package impl;

import Dao.UserDao;
import Model.User;
import Service.UserService;

public class userServiceImpl implements UserService {
    private UserDao userDao;

    public userServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void srchUser(int a) {
        int counter = 0;
        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if (userDao.getUsers().get(i).getId() == a) {
                System.out.println(userDao.getUsers().get(i));
                counter++;
                break;
            }
        }

        try {
                if (counter == 0) {
                    throw new RuntimeException();
                }
        } catch (RuntimeException e) {
            System.out.println("Myndai user jok");
        }

    }

    @Override
    public void removeUser(int a) {
        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if (userDao.getUsers().get(i).getId()==a){
                userDao.getUsers().remove(a);
                break;
            }

        }

    }

    @Override
    public void getUsers() {
        userDao.getAllUsers();
    }

}
