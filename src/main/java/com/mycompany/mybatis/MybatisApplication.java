package com.mycompany.mybatis;

import com.mycompany.mybatis.mapper.PersonMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class  MybatisApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(MybatisApplication.class, args);
	}

	private final PersonMapper personMapper;

	public MybatisApplication(PersonMapper personMapper) {
		this.personMapper = personMapper;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.personMapper.selectAll());
	}
}
