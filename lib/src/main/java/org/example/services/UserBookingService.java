package org.example.services;

import com.fasterxml.jackson.core.type.TypeReference;
import org.example.entities.User;

import java.io.File;
import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;


public class UserBookingService
{
    private User user1;
    private List<User> userList;
    private ObjectMapper objectMapper= new ObjectMapper();

    private static final String userPath = "../localDB/users.json";
    public UserBookingService(User user) throws IOException {
        this.user1 = user;
        File Users= new File(userPath);
        userList=objectMapper.readValue(Users, new TypeReference<List<User>>() {});
    }
}
