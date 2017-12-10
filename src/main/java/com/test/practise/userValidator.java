package com.test.practise;

public class userValidator {
    public boolean validateUser(String user, String password) {
        return user.trim().equalsIgnoreCase("allen") && password.equals("dummy");
    }
}
