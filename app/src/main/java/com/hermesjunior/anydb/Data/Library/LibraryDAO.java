package com.hermesjunior.anydb.Data.Library;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.hermesjunior.anydb.Data.Common.IDAO;

import java.util.List;

@Dao
public interface LibraryDAO extends IDAO<Library> {

    @Insert
    void insert(Library library);

    @Query("SELECT * from libraries ORDER BY created_time")
    LiveData<List<Library>> getAll();

    @Delete
    void delete(Library library);

    @Query("DELETE FROM libraries")
    void deleteAll();
}
