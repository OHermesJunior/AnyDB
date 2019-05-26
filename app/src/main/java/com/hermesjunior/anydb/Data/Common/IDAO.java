package com.hermesjunior.anydb.Data.Common;

public interface IDAO<T> {
    void insert(T obj);

    void delete(T obj);

    void deleteAll();
}
