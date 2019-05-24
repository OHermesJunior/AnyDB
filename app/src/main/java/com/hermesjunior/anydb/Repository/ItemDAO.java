package com.hermesjunior.anydb.Repository;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ItemDAO {
    @Query("SELECT * from items WHERE lib_uuid =:lib_uuid")
    LiveData<List<Item>> getItemsFromLib(String lib_uuid);

    @Insert
    void insert(Item item);

    @Query("DELETE FROM items")
    void deleteAll();

    @Delete
    void deleteItem(Item item);
}
