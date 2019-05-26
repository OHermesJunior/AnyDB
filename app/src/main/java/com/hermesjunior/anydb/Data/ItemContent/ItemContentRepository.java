package com.hermesjunior.anydb.Data.ItemContent;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.hermesjunior.anydb.Data.Common.AppDatabase;
import com.hermesjunior.anydb.Data.Common.IRepository;
import com.hermesjunior.anydb.Data.Common.Task;

import java.util.List;

public class ItemContentRepository implements IRepository<ItemContent> {

    private ItemContentDAO itemContentDAO;

    public ItemContentRepository(Application application) {
        itemContentDAO = AppDatabase.getDatabase(application).itemContentDAO();
    }

    @Override
    public void insert(ItemContent obj) {
        new Task<>(itemContentDAO).insert(obj);
    }

    @Override
    public LiveData<List<ItemContent>> getAll() {
        return itemContentDAO.getAll();
    }

    @Override
    public LiveData<List<ItemContent>> getFrom() {
        return null;
    }

    @Override
    public void delete(ItemContent object) {
        new Task<ItemContent>(itemContentDAO).delete(object);
    }

    @Override
    public void deleteAll() {
        new Task<ItemContent>(itemContentDAO).deleteAll();
    }
}
