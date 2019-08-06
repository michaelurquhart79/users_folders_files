package com.codeclan.example.fileservice.components;

import com.codeclan.example.fileservice.models.File;
import com.codeclan.example.fileservice.models.Folder;
import com.codeclan.example.fileservice.models.User;
import com.codeclan.example.fileservice.repositories.FileRepository;
import com.codeclan.example.fileservice.repositories.FolderRepository;
import com.codeclan.example.fileservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }


    public void run(ApplicationArguments args) {

        User mike = new User("Mike");
        userRepository.save(mike);

        User steve = new User("Steve");
        userRepository.save(steve);

        Folder work = new Folder("Work", mike);
        folderRepository.save(work);

        Folder play = new Folder("Play", mike);
        folderRepository.save(play);

        Folder bikes = new Folder("Bikes", steve);
        folderRepository.save(bikes);

        Folder instruments = new Folder("Instruments", steve);
        folderRepository.save(instruments);

        Folder games = new Folder("Games", steve);
        folderRepository.save(games);

        File java = new File("JavaStuff", "java", 50, work);
        fileRepository.save(java);

        File ruby = new File("RubyStuff", "rb", 20, work);
        fileRepository.save(ruby);

        File nothing = new File("NoFunForMike", "ever", 2000, play);
        fileRepository.save(nothing);

        File brakes = new File("BrakesStuf", "txt", 50, bikes);
        fileRepository.save(brakes);

        File forks = new File("ForksPics", "jpg", 2500, bikes);
        fileRepository.save(forks);

        File shocks = new File("shocks_info", "html", 300, bikes);
        fileRepository.save(shocks);

        File moogs = new File("Moog_Articles", "pages", 500, instruments);
        fileRepository.save(moogs);

        File portal = new File("Portal", "ps4", 50000, games);
        fileRepository.save(portal);

        File granTurismo = new File("Gran Turismo", "ps", 700, games);
        fileRepository.save(granTurismo);
    }
}
