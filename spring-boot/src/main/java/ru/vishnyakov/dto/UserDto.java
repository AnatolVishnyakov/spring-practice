package ru.vishnyakov.dto;

public class UserDto {
    private Long id;

    public UserDto() {
    }

    public UserDto(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
