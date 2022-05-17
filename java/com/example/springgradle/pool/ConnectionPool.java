package com.example.springgradle.pool;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("pool")
public class ConnectionPool/* implements InitializingBean, DisposableBean*/ {

    private final String username;
    private final int poolSize;
//    private List<Object> args;
//    private Map<String,Object> properties;

    public ConnectionPool(@Value("${db.username}") String username,
                          @Value("${db.pool.size}") int poolSize) {
        this.username = username;
        this.poolSize = poolSize;
    }





//    public ConnectionPool(String username, int poolSize, List<Object> args, Map<String, Object> properties) {
//        this.username = username;
//        this.poolSize = poolSize;
//        this.args = args;
//        this.properties = properties;
//    }

//    public void setProperties(Map<String, Object> properties) {
//        this.properties = properties;
//    }

    @PostConstruct
    private void init() {
        System.out.println("init method xml");
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("init method InitializingBean");
//    }

//    @Override
//    public void destroy() throws Exception {
//        System.out.println("destroy method DisposableBean");
//    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy method xml");
    }


}
