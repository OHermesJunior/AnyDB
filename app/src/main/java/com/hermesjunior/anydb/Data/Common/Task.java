package com.hermesjunior.anydb.Data.Common;

import android.os.AsyncTask;

public class Task<T> extends AsyncTask<T, Void, Void> {

    private IDAO<T> DAO;
    private boolean insert = false;
    private boolean delete = false;
    private boolean deleteAll = false;

    public Task(IDAO DAO) {
        super();
        this.DAO = DAO;
    }

    public void insert(T item) {
        insert = true;
        execute(item);
    }

    public void delete(T item) {
        delete = true;
        execute(item);
    }

    public void deleteAll() {
        deleteAll = true;
        execute();
    }

    @Override
    protected Void doInBackground(final T[] items) {
        if (insert)
            DAO.insert(items[0]);
        else if (delete)
            DAO.delete(items[0]);
        else if (deleteAll)
            DAO.deleteAll();
        return null;
    }
}
