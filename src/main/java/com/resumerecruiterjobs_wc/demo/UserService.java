package com.resumerecruiterjobs_wc.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public Long countByEmail(String email){
        return userRepository.countByEmail(email);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }



    public void saveAdmin(User user){
        user.setRoles(Arrays.asList(roleRepository.findByRole("Admin")));
        user.setEnabled(true);
        userRepository.save(user);
    }

    public void saveUser(User user) {
        user.setRoles(Arrays.asList(roleRepository.findByRole("User")));
        user.setEnabled(true);
        userRepository.save(user);
    }

    public void saveEmployer(User user) {
        user.setRoles(Arrays.asList(roleRepository.findByRole("Employer")));
        user.setEnabled(true);
        userRepository.save(user);
    }

    public void saveApplicant(User user) {
        user.setRoles(Arrays.asList(roleRepository.findByRole("Applicant")));
        user.setEnabled(true);
        userRepository.save(user);
    }

    public void saveRecruiter(User user) {
        user.setRoles(Arrays.asList(roleRepository.findByRole("Recruiter")));
        user.setEnabled(true);
        userRepository.save(user);
    }


}
