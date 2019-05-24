package com.hermesjunior.anydb.Repository;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

public interface LibraryDAO {
    @Query("SELECT * from libraries ORDER BY created_time")
    LiveData<List<Library>> getAll();

    @Insert
    void insert(Library library);

    @Query("DELETE FROM Items")
    void deleteAll();

    @Delete
    void deleteLibrary(Library library);
}