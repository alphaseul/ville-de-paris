package com.paris;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class UserTest {
    @Test
    public void createNewUser(){
        User user = new User("alpha",23);
        Assertions.assertEquals(user.getName(),"alpha","le nom est correcte");
        Assertions.assertEquals(user.getAge(), 23);
    }
}