package com.company.repository;

import java.util.List;

public interface AbstractRepository<K, T> {
    T create(T entity);

    T findById(K id);

    K countAll();

    List<T> findAll();

    boolean delete(K id);
}
