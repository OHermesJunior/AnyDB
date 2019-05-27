package com.hermesjunior.anydb.Data.Common;

import android.os.AsyncTask;

public class Task<T> extends AsyncTask<T, Void, Void> {

    final private IDAO DAO;
    private boolean insert = false;
    private boolean delete = false;
    private boolean deleteAll = false;

    public Task(final IDAO DAO) {
        super();
        this.DAO = DAO;
    }

    public void insert(final T obj) {
        insert = true;
        execute(obj);
    }

    public void delete(final T obj) {
        delete = true;
        execute(obj);
    }

    public void deleteAll() {
        deleteAll = true;
        execute();
    }

    @Override
    protected Void doInBackground(final T... objs) {
        if (insert) {
            DAO.insert(objs[0]);
        } else if (delete) {
            DAO.delete(objs[0]);
        } else if (deleteAll) {
            DAO.deleteAll();
        }
        return null;
    }
}
