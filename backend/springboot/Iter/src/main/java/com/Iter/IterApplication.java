package com.Iter;

import com.Iter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IterApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {

		SpringApplication.run(IterApplication.class, args);
	}

	@Override
	public void run(String... args) {

		System.out.println("Staring code....!");
//		User user = new User();
//		user.setUsername("leduc");
//		user.setPassword("leduc2821");
//		user.setFirstName("Le");
//		user.setLastName("Duc");
//		user.setEmail("leduc2821@gmail.com");
//		user.setPhone("01234456789");
//		user.setProfile("default.png");
//		Role role1= new Role();
//		role1.setRoleName("user");
//		role1.setDescription("normal user");
//		Set<UserRole> userRoles=new HashSet<>();
//		UserRole  userRole1=new UserRole();
//		userRole1.setRole(role1);
//		userRole1.setUser(user);
//		userRoles.add(userRole1);
//		User user1= this.userService.createUser(user,userRoles);
//		System.out.println(user1.getFirstName());
	}

}

