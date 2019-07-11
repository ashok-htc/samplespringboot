package org.htcinc.com.samplemicroservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDetailDao {

	private static List<UserDetail> userDetail = new ArrayList<>();
	
	static {
		userDetail.add(new UserDetail(1,"Ashok","Yerrram"));
		userDetail.add(new UserDetail(2,"Ash","Yerrram"));
		userDetail.add(new UserDetail(3,"shok","Yerrram"));
		
	}
	
	public List<UserDetail> getUserDetails() {
		return userDetail;
	}
}

