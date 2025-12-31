package com.peihengyi.tliashandmade;

import com.peihengyi.tliashandmade.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TliasHandmadeApplicationTests {
        @Autowired
        private UserService userService;
        @Test
        public void testUserController(){
                System.out.println(userService.findAll());
        }

}
