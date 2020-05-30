package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.UserDAO;
import kr.re.kitri.hello.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDAO dao;

    public void registUser(User user) {
        dao.insertUser(user);

    }

    public List<User> getAllUsers() {
//        double a = 3 / 0;  //예외처리를 위한 에러

//        int[] a = {1,2,3};
//        int k = a[4];

        return dao.selectAllUsers();
    }


    public User getUserDatail(String userId) {
        return dao.selectUserByUserId(userId);
    }
}
