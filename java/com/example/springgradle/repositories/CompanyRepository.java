package com.example.springgradle.repositories;

import com.example.springgradle.bpp.Transaction;
import com.example.springgradle.entity.Company;
import com.example.springgradle.pool.ConnectionPool;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@Repository
@Transaction
public class CompanyRepository implements CrudRepository<Integer,Company>{

//    private final ConnectionPool connectionPool;
//
//    public CompanyRepository(ConnectionPool connectionPool) {
//        this.connectionPool = connectionPool;
//    }
//
//    public static CompanyRepository of(ConnectionPool connectionPool){
//        return new CompanyRepository(connectionPool);
//    }

//    @InjectBean

    private final ConnectionPool pool;
    private final List<ConnectionPool> pools;
    private final Integer poolSize;

    public CompanyRepository(ConnectionPool pool,
                             List<ConnectionPool> pools,
                             @Value("${db.pool.size}") Integer poolSize) {
        this.pool = pool;
        this.pools = pools;
        this.poolSize = poolSize;
    }

    @PostConstruct
    private void init(){
        System.out.println("init company repository");
    }

    @Override
    public Optional<Company> findById(Integer id) {
        System.out.println("findById method...");
        return Optional.of(new Company(id));
    }

    @Override
    public void delete(Company entity) {
        System.out.println("delete method ...");
    }
}
