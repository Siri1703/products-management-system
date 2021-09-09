package com.example.demo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface details extends CrudRepository<laptop,Integer>{

	@Transactional
	@Modifying
	@Query(value="update laptop set cost=?1 where id=?2")
	public void updateById(int cost,int lapid);
	
	
}
