package com.hermesjunior.anydb.Data.Common;

import androidx.lifecycle.LiveData;

import java.util.List;

public interface IRepository<T> {

    void insert(T item);

    LiveData<List<T>> getAll();

    LiveData<List<T>> getFrom();

    void delete(T item);

    void deleteAll();
}
