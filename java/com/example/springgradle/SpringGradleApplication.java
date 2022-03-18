package com.example.springgradle;

import com.example.springgradle.pool.ConnectionPool;
import com.example.springgradle.repositories.CompanyRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class SpringGradleApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringGradleApplication.class, args);

        //ApplicationContext
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml")){
//        ConnectionPool pool = context.getBean(ConnectionPool.class); // class -> string Map<String,Object>
            ConnectionPool pool = context.getBean("pool", ConnectionPool.class);
            ConnectionPool pool1 = context.getBean("pool", ConnectionPool.class);

            CompanyRepository companyRepository = context.getBean("companyRepository", CompanyRepository.class);

            System.out.println(pool1);
            System.out.println(pool);
            System.out.println(companyRepository);
        }

    }

}
