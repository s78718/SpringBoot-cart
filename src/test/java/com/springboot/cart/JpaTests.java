package com.springboot.cart;

import com.springboot.cart.domain.User;
import com.springboot.cart.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CartApplication.class)
public class JpaTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test(){
        List<User> all = userRepository.findAll();
        System.out.println(all);

    }

}
