package com.hermesjunior.anydb.Data.Library;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.hermesjunior.anydb.Data.Common.AppDatabase;
import com.hermesjunior.anydb.Data.Common.IRepository;
import com.hermesjunior.anydb.Data.Common.Task;

import java.util.List;

public class LibraryRepository implements IRepository<Library> {

    final private LibraryDAO libraryDAO;

    public LibraryRepository(final Application application) {
        libraryDAO = AppDatabase.getDatabase(application).libraryDAO();
    }

    @Override
    public void insert(Library object) {
        new Task<Library>(libraryDAO).insert(object);
    }

    @Override
    public LiveData<List<Library>> getAll() {
        return libraryDAO.getAll();
    }

    @Override
    public LiveData<List<Library>> getFrom(String param) {
        return null;
    }

    @Override
    public void delete(Library item) {
        new Task<Library>(libraryDAO).delete(item);
    }

    @Override
    public void deleteAll() {
        new Task<Library>(libraryDAO).deleteAll();
    }
}
