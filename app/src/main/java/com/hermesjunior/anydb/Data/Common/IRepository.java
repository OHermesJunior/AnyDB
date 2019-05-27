package com.hermesjunior.anydb.Data.Common;

import androidx.lifecycle.LiveData;

import java.util.List;

public interface IRepository<T> {

    void insert(T obj);

    LiveData<List<T>> getAll();

    LiveData<List<T>> getFrom(String param);

    void delete(T obj);

    void deleteAll();
}
