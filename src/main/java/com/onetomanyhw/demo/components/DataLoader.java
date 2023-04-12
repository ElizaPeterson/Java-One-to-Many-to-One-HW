package com.onetomanyhw.demo.components;

import com.onetomanyhw.demo.models.File;
import com.onetomanyhw.demo.models.Folder;
import com.onetomanyhw.demo.models.Person;
import com.onetomanyhw.demo.repositories.FileRepository;
import com.onetomanyhw.demo.repositories.FolderRepository;
import com.onetomanyhw.demo.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Profile(("!test"))
@Component
public class DataLoader {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public void run(ApplicationArguments args) throws Exception {
        File file1 = new File("Sorting", "py",50);
        fileRepository.save(file1);

        Person person1 = new Person("Eliza");
        personRepository.save(person1);

        Folder folder1 = new Folder("PDA");
    }
}
