package org.example.services;

import org.example.entities.User;

import java.io.File;
import java.util.List;

public class UserBookingService
{
    private User user1;
    private List<User> userList;
    private ObjectMapper objectMapper= new ObjectMapper();

    private static final String userPath = "../localDB/users.json";
    public UserBookingService(User user)
    {
        this.user1 = user;
        File Users= new File(userPath);

    }
}
