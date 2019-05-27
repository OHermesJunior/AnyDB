package com.hermesjunior.anydb.Data.Item;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.hermesjunior.anydb.Data.Common.AppDatabase;
import com.hermesjunior.anydb.Data.Common.IRepository;
import com.hermesjunior.anydb.Data.Common.Task;

import java.util.List;

public class ItemRepository implements IRepository<Item> {

    final private ItemDAO itemDAO;

    public ItemRepository(final Application application) {
        itemDAO = AppDatabase.getDatabase(application).itemDAO();
    }

    @Override
    public void insert(Item item) {
        new Task<Item>(itemDAO).insert(item);
    }

    @Override
    public LiveData<List<Item>> getAll() {
        return itemDAO.getAll();
    }

    @Override
    public LiveData<List<Item>> getFrom(String param) {
        return itemDAO.getItemsFromLib(param);
    }

    @Override
    public void delete(Item item) {
        new Task<Item>(itemDAO).delete(item);
    }

    @Override
    public void deleteAll() {
        new Task<Item>(itemDAO).deleteAll();
    }
}
