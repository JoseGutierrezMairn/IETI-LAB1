package edu.eci.USERSMICROSERVICERESTFULAPI.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import java.util.Date;

public class UserDto {

    private String name;
    private String email;
    private String lastName;

    @JsonFormat(shape = Shape.STRING, pattern = "dd/MM/yyyy", timezone = "America/New_York")
    private Date createdAt;


    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getName() {
        return name;
    }
}
