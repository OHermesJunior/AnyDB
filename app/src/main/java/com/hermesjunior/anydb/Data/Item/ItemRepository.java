package com.hermesjunior.anydb.Data.Item;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.hermesjunior.anydb.Data.Common.AppDatabase;
import com.hermesjunior.anydb.Data.Common.IRepository;
import com.hermesjunior.anydb.Data.Common.Task;

import java.util.List;

public class ItemRepository implements IRepository<Item> {
    private ItemDAO itemDAO;

    public ItemRepository(Application application) {
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
    public LiveData<List<Item>> getFrom() {
        //TODO
        return null;
    }

    @Override
    public void deleteAll() {

    }


    @Override
    public void delete(Item item) {

    }
}
