package com.website.service;

import com.website.model.User;
import jdk.jshell.spi.ExecutionControl;

import java.util.concurrent.ExecutionException;

public interface UserService {
    public User findUserByJwtToken(String jwt) throws Exception;
    public User findUserByEmail(String email ) throws Exception;
}
