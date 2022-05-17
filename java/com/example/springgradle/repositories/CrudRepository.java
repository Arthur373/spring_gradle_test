package com.example.springgradle.repositories;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CrudRepository<K, E> {

    Optional<E> findById(K id);

    void delete(E entity);
}
