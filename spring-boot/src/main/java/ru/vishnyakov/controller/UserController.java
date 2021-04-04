package ru.vishnyakov.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.vishnyakov.dto.UserDto;
import ru.vishnyakov.service.UserService;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    public void find(@PathVariable("id") Long id) {
        UserDto userDto = userService.find(id);
//        return ResponseEntity.ok(userDto);
    }
}
