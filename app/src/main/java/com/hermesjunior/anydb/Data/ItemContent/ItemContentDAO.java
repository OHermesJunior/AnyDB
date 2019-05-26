package com.hermesjunior.anydb.Data.ItemContent;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ItemContentDAO {

    @Query("SELECT * from item_content WHERE item_uuid =:item_uuid")
    LiveData<List<ItemContent>> getContentFromItem(String item_uuid);

    @Query("SELECT * from item_content")
    LiveData<List<ItemContent>> getAll();

    @Insert
    void insert(ItemContent itemContent);

    @Query("DELETE FROM item_content")
    void deleteAll();

    @Delete
    void deleteItemContent(ItemContent itemContent);
}
