package com.hermesjunior.anydb.Repository;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

public interface TemplateDAO {
    @Query("SELECT * from template WHERE lib_uuid =:lib_uuid")
    LiveData<List<Item>> getTemplateFromLib(String lib_uuid);

    @Insert
    void insert(Template template);

    @Query("DELETE FROM template")
    void deleteAll();

    @Delete
    void deleteTemplate(Template template);
}
