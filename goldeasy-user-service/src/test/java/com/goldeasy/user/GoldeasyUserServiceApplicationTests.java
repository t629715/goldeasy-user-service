package com.goldeasy.user;

import com.goldeasy.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.spring.annotation.MapperScan;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.goldeasy.user.mapper")
public class GoldeasyUserServiceApplicationTests {
	@Autowired
	private UserService userService;
	@Test
	public void contextLoads() {
	}

	@Test
	public void testRegister(){
		userService.register("123","111111");
	}

}
