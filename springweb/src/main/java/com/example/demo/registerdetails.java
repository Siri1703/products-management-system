package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface registerdetails extends CrudRepository<register,String> {

	boolean existsByusername(String user);

	boolean existsBypassword(String password);



}
