package com.hermesjunior.anydb.Data.ItemContent;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.hermesjunior.anydb.Data.Common.IDAO;

import java.util.List;

@Dao
public interface ItemContentDAO extends IDAO<ItemContent> {

    @Insert
    void insert(ItemContent itemContent);

    @Query("SELECT * from item_content WHERE item_uuid =:item_uuid")
    LiveData<List<ItemContent>> getContentFromItem(String item_uuid);

    @Query("SELECT * from item_content")
    LiveData<List<ItemContent>> getAll();

    @Delete
    void deleteItemContent(ItemContent itemContent);

    @Query("DELETE FROM item_content")
    void deleteAll();
}
