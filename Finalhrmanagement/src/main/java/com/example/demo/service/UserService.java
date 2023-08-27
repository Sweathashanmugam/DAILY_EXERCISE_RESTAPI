package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.UserModel;

@Service
public interface UserService {
    public boolean addUser(UserModel user);
    
    public boolean updateUse(UserModel user);
	List<UserModel> getUser();
     public boolean deleteUser(int eid);
	boolean updateUser(int eid, UserModel user);
	
}