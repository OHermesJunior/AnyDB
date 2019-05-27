package com.hermesjunior.anydb.Data.Item;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.hermesjunior.anydb.Data.Common.IDAO;

import java.util.List;

@Dao
public interface ItemDAO extends IDAO<Item> {

    @Insert
    void insert(Item item);

    @Query("SELECT * from items WHERE lib_uuid =:param")
    LiveData<List<Item>> getFrom(String param);

    @Query("SELECT * from items")
    LiveData<List<Item>> getAll();

    @Delete
    void delete(Item item);

    @Query("DELETE FROM items")
    void deleteAll();

}
