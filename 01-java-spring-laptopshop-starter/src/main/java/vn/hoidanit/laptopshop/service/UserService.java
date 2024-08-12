package vn.hoidanit.laptopshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.hoidanit.laptopshop.domain.User;
import vn.hoidanit.laptopshop.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String HandleHello() {
        return "Hello from Service";
    }

    public List<User> GetAllUser() {
        return this.userRepository.findAll();
    }

    public List<User> GetAllUserByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    public User HandleSaveUser(User user) {
        return this.userRepository.save(user);
    }
}
