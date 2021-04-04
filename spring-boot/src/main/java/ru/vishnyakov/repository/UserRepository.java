package ru.vishnyakov.repository;

import org.springframework.stereotype.Repository;
import ru.vishnyakov.dto.UserDto;

@Repository
public class UserRepository {
    private final UserDto userDto;

    public UserRepository(UserDto userDto) {
        this.userDto = userDto;
    }

    public UserDto find(Long id) {
        System.out.println(userDto.getId());
        return userDto;
    }
}
