package com.cicili.admin;


public interface UserService {
	User save(User user);

	User findByEmail(String email);

}
