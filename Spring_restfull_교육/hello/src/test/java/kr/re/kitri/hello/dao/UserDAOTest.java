package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.User;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserDAOTest {
    @Autowired
    private UserDAO dao;

    //테스트 메소드는 public void
    @Test
    public void testInsertUser(){
        User user = new User("did" , "양" , 23);
        dao.insertUser(user);
    }

    @Test
    public void testSelectAllUsers(){
        assertTrue(!dao.selectAllUsers().get(0).getUserId().equals(null));
    }

    @Test
    public void selectUserByUserId(){
        User user = new User("GG" , "곽재우" , 25);
        User d = dao.selectUserByUserId(user.getUserId());
        assertEquals(d , user);
    }
}
