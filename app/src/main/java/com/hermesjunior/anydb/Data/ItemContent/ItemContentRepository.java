package com.hermesjunior.anydb.Data.ItemContent;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.hermesjunior.anydb.Data.Common.AppDatabase;
import com.hermesjunior.anydb.Data.Common.IRepository;
import com.hermesjunior.anydb.Data.Common.Task;

import java.util.List;

public class ItemContentRepository implements IRepository<ItemContent> {

    final private ItemContentDAO itemContentDAO;

    public ItemContentRepository(final Application application) {
        itemContentDAO = AppDatabase.getDatabase(application).itemContentDAO();
    }

    @Override
    public void insert(ItemContent itemContent) {
        new Task<>(itemContentDAO).insert(itemContent);
    }

    @Override
    public LiveData<List<ItemContent>> getAll() {
        return itemContentDAO.getAll();
    }

    @Override
    public LiveData<List<ItemContent>> getFrom(String param) {
        return null;
    }

    @Override
    public void delete(ItemContent itemContent) {
        new Task<ItemContent>(itemContentDAO).delete(itemContent);
    }

    @Override
    public void deleteAll() {
        new Task<ItemContent>(itemContentDAO).deleteAll();
    }
}
