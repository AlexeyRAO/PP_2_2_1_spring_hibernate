package hiber.service;

import hiber.dao.UserDao;
import hiber.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

   private final UserDao userDao;

   public UserServiceImp(UserDao userDao) {
      this.userDao = userDao;
   }

   @Transactional
   @Override
   public void addUser(User user) {
      userDao.addUser(user);
   }

   @Transactional(readOnly = true)
   @Override
   public List<User> listUsers() {
      return userDao.listUsers();
   }
   @Transactional
   @Override
   public User getUserCar(String model, int series) {
      return userDao.getUserCar(model, series);
   }

}
