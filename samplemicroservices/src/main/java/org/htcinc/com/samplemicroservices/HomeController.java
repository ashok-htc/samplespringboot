package org.htcinc.com.samplemicroservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Autowired
	private UserDetailDao userDetailDao;

	@GetMapping("/home")
	public String homepage() {
		return "Hello Docker World";
	}

	@GetMapping("/userdetails")
	public List<UserDetail> getUserDetails() {
		return userDetailDao.getUserDetails();
	}
}
