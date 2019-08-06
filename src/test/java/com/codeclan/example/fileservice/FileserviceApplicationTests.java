package com.codeclan.example.fileservice;

import com.codeclan.example.fileservice.models.Folder;
import com.codeclan.example.fileservice.models.User;
import com.codeclan.example.fileservice.repositories.FolderRepository;
import com.codeclan.example.fileservice.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileserviceApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Test
	public void contextLoads() {
	}

//	@Test
//	public void createUser(){
//		User user1 = new User("Mike Urquhart");
//		userRepository.save(user1);
//
//	}

	@Test
	public void createUserAndFolder(){
		User user2 = new User("Steve S");
		userRepository.save(user2);

		Folder folder1 = new Folder("School Work", user2);
		folderRepository.save(folder1);
	}

}
