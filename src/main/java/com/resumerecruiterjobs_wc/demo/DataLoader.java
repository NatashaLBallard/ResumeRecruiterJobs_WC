package com.resumerecruiterjobs_wc.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    public void run(String... strings) throws Exception {
        System.out.println("Loading data...");

        roleRepository.save(new RoleClass("ADMIN"));
        roleRepository.save(new RoleClass("USER"));
        roleRepository.save(new RoleClass("APPLICANT"));
        roleRepository.save(new RoleClass("EMPLOYER"));
        roleRepository.save(new RoleClass("RECRUITER"));


        RoleClass adminRole = roleRepository.findByRole("ADMIN");
        RoleClass userRole = roleRepository.findByRole("USER");
        RoleClass applicantRole = roleRepository.findByRole("APPLICANT");
        RoleClass employerRole = roleRepository.findByRole("EMPLOYER");
        RoleClass recruiterRole = roleRepository.findByRole("RECRUITER");

        User user = new
                User("bob@bob.com", "bob", "Bob", "Bobberson", true, "bob", "User");
        user.setRoles(Arrays.asList(userRole));
        userRepository.save(user);

        user = new
                User("jim@jim.com", "password", "Jim", "Jimmerson", true, "employer", "Employer");
        user.setRoles(Arrays.asList(employerRole));
        userRepository.save(user);

        user = new
                User("admin@adm.com", "password", "Admin", "User", true, "admin", "Admin");
        user.setRoles(Arrays.asList(adminRole));
        userRepository.save(user);

        user = new
                User("sam@ev.com", "password", "Sam", "Everyman", true, "applicant", "Admin");
        user.setRoles(Arrays.asList(applicantRole));
        userRepository.save(user);


        user = new
                User("karen@karen.com", "password", "Karen", "Karenson", true, "recruiter", "Recruiter");
        user.setRoles(Arrays.asList(recruiterRole));
        userRepository.save(user);
    }
}
