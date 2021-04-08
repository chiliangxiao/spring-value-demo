package com.chilx;

import com.chilx.value.User;
import com.chilx.value.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author chilx
 * @date 2021/4/7
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class ValueTest {

    @Autowired
    private User user;

    @Autowired
    private Person person;
    @Test
    public void valueTest() {

        System.out.println(person.toString());

    }

    @Test
    public void propertiesTest() {

        System.out.println(user.toString());

    }
}
