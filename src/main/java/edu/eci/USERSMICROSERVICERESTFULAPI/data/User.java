package edu.eci.USERSMICROSERVICERESTFULAPI.data;

import com.fasterxml.jackson.annotation.JsonFormat;
import edu.eci.USERSMICROSERVICERESTFULAPI.dto.UserDto;

import java.util.Date;
import java.util.UUID;

public class User {

    private String id;
    private String name;
    private String email;
    private String lastName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", timezone = "America/New_York")
    private Date createdAt;

    public User(UserDto dto) {
        this.id = UUID.randomUUID().toString();
        this.name = dto.getName();
        this.email = dto.getEmail();
        this.lastName = dto.getLastName();
        this.createdAt = dto.getCreatedAt();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
