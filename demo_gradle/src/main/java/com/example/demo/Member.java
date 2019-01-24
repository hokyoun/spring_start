package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	/* @Id : 일반적으로 키(primary key)를 가지는 변수에 선언합니다. 
	 * @GeneratedValue 어노테이션은 해당 Id 값을 어떻게 자동으로 생성할지 전략을 선택 여기선 AUTO
	   @Table을 이용하면 별도의 이름을 가진 데이터베이스 테이블과 매핑할 수 있습니다. 
	      기본적으로 @Entity로 선언된 클래스의 이름은 실제 데이터베이스의 테이블 명과 일치하는 것을 매핑
	*/
	
	@Column
	private String name;
	
	@Column
	private int age;
	
public Member() {}
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "[" + id + "] name = " + name + ", age = " + age;
	}
}

