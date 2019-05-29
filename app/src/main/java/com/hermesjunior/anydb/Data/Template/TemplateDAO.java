package com.hermesjunior.anydb.Data.Template;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.hermesjunior.anydb.Data.Common.IDAO;

import java.util.List;

@Dao
public interface TemplateDAO extends IDAO<Template> {

    @Insert
    void insert(Template template);

    @Query("SELECT * from template WHERE lib_uuid =:lib_uuid")
    LiveData<List<Template>> getFrom(String lib_uuid);

    @Query("SELECT * from template")
    LiveData<List<Template>> getAll();

    @Delete
    void delete(Template template);

    @Query("DELETE FROM template")
    void deleteAll();
}
