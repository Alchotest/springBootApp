package by.springBoot.Markevich.service;

import by.springBoot.Markevich.DataTransferObject.UserDto;
import by.springBoot.Markevich.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserDto registration);

    List<User> findAllUsers();
}
