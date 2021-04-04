package ru.vishnyakov.service;

import org.springframework.stereotype.Service;
import ru.vishnyakov.dto.UserDto;
import ru.vishnyakov.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDto find(Long id) {
        return userRepository.find(id);
    }
}
