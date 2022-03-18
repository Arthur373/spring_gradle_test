package com.example.springgradle.repositories;

import com.example.springgradle.bpp.InjectBean;
import com.example.springgradle.pool.ConnectionPool;
import org.springframework.beans.factory.annotation.Autowired;

public class CompanyRepository {

//    private final ConnectionPool connectionPool;
//
//    public CompanyRepository(ConnectionPool connectionPool) {
//        this.connectionPool = connectionPool;
//    }
//
//    public static CompanyRepository of(ConnectionPool connectionPool){
//        return new CompanyRepository(connectionPool);
//    }
    @InjectBean
    private ConnectionPool connectionPool;

}
