package com.example.springgradle.repositories;

import com.example.springgradle.pool.ConnectionPool;

public class UserRepository {

    private final ConnectionPool connectionPool;

    public UserRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}
