package com.goldeasy.user;

import com.goldeasy.user.dto.UserRegisterDTO;
import com.goldeasy.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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
		UserRegisterDTO userRegisterDTO = new UserRegisterDTO();
		userRegisterDTO.setPhone("13271756102");
		userRegisterDTO.setPassword("qq123456");
//		userService.register(userRegisterDTO);
	}

	@Test
	public void testLogin(){
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



}
