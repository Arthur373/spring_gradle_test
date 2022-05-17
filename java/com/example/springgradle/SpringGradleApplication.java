package com.example.springgradle;

import com.example.springgradle.config.ApplicationConfiguration;
import com.example.springgradle.pool.ConnectionPool;
import com.example.springgradle.repositories.CompanyRepository;
import com.example.springgradle.repositories.CrudRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class SpringGradleApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringGradleApplication.class, args);

        //ApplicationContext
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml")
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class)){
//        ConnectionPool pool = context.getBean(ConnectionPool.class); // class -> string Map<String,Object>
            ConnectionPool pool = context.getBean("pool", ConnectionPool.class);
            ConnectionPool pool1 = context.getBean("pool", ConnectionPool.class);

//            CompanyRepository companyRepository = context.getBean("companyRepository", CompanyRepository.class);
            CrudRepository companyRepository = context.getBean("companyRepository", CrudRepository.class);

            System.out.println(pool1);
            System.out.println(pool);
            System.out.println(companyRepository.findById(1));
        }

    }

}
