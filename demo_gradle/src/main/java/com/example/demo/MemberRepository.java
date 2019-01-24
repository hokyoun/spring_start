package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface MemberRepository extends CrudRepository<Member, Long> {
	
	@Query("select t from Member t where name=:name and age < :age")
	List<Member> findByNameAndAgeLessThanSQL(@Param("name") String name, @Param("age") int age);

}
