package com.codeclan.example.fileservice;

import com.codeclan.example.fileservice.models.File;
import com.codeclan.example.fileservice.models.Folder;
import com.codeclan.example.fileservice.models.User;
import com.codeclan.example.fileservice.repositories.FileRepository;
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

	@Autowired
	FileRepository fileRepository;

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

	@Test
	public void createFile(){
		User user = new User("Kev B");
		userRepository.save(user);

		Folder folder = new Folder("NSFW", user);
		folderRepository.save(folder);

		File file1 = new File("Ladies", "jpg",1200, folder);
		fileRepository.save(file1);

		File file2 = new File("Men", "jpg", 1500, folder);
		fileRepository.save(file2);
	}

}
