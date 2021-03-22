package com.example.demo.uss.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.domain.UserDto;

public interface UserService  {
	public Optional<User> findOne(User t);
	public long count();
	boolean existsById(long id);
	public List<UserDto> findAll(Sort sort);
	public Optional<UserDto> findOne();
	public void deleteById(long id);
	public User getOnt(long id);
	public User save(UserDto entity);
}
