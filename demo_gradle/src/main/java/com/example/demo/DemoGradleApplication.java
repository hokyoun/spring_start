package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoGradleApplication implements CommandLineRunner {
	
	@Autowired
	MemberRepository memberRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoGradleApplication.class, args);
		
		System.out.println("######################MAIN##########################");
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		memberRepository.save(new Member("a", 10));
		
		Iterable<Member> list1 = memberRepository.findAll();
		System.out.println("findAll() Method.");
		for( Member m : list1){
			System.out.println(m.toString());
		}
		
		System.out.println("findByNameAndAgeLessThanSQL() Method.");
		List<Member> list2 = memberRepository.findByNameAndAgeLessThanSQL("a", 15);
		for( Member m : list2){
			System.out.println(m.toString());
		}
		
		memberRepository.deleteAll();
	}

}

