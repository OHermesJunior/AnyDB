package com.hermesjunior.anydb.Data.Template;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TemplateDAO {

    @Query("SELECT * from template WHERE lib_uuid =:lib_uuid")
    LiveData<List<Template>> getTemplateFromLib(String lib_uuid);

    @Query("SELECT * from template")
    LiveData<List<Template>> getAll();

    @Insert
    void insert(Template template);

    @Query("DELETE FROM template")
    void deleteAll();

    @Delete
    void deleteTemplate(Template template);
}
