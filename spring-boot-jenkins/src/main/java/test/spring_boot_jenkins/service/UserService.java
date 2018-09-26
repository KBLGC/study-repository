package test.spring_boot_jenkins.service;

import test.spring_boot_jenkins.entity.User;

public interface UserService {
    
	public User getUserById(Long id);
}
