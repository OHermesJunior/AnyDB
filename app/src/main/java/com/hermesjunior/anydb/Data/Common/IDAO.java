package com.hermesjunior.anydb.Data.Common;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

public interface IDAO<T> {
    @Insert
    void insert(T obj);

    @Delete
    void delete(T obj);

    @Query("")
    void deleteAll();
}
