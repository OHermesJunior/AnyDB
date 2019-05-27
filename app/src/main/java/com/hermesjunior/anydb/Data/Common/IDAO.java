package com.hermesjunior.anydb.Data.Common;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

public interface IDAO<T> {
    @Insert
    void insert(T obj);

    @Query("")
    LiveData<List<T>> getAll();

    @Query("")
    LiveData<List<T>> getFrom();

    @Delete
    void delete(T obj);

    @Query("")
    void deleteAll();
}
