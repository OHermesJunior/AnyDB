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

    @Delete
    void delete(Item item);

    @Query("SELECT * from items WHERE lib_uuid =:lib_uuid")
    LiveData<List<Item>> getItemsFromLib(String lib_uuid);

    @Query("SELECT * from items")
    LiveData<List<Item>> getAll();


    @Query("DELETE FROM items")
    void deleteAll();

}
