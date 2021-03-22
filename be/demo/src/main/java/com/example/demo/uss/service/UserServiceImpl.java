package com.example.demo.uss.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.domain.UserDto;
import com.example.demo.uss.repository.UserRepositoryImpl;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class UserServiceImpl implements UserService{
	private final UserRepositoryImpl repo;
	
	
	void test() {
		repo.test();
		System.out.print("abc");
		Math.random();
	}


	@Override
	public Optional<User> findOne(User t) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean existsById(long id) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public List<UserDto> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Optional<UserDto> findOne() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public User getOnt(long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public User save(UserDto entity) {
		// TODO Auto-generated method stub
		return null;
	}
}
