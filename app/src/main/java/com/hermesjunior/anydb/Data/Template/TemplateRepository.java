package com.hermesjunior.anydb.Data.Template;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.hermesjunior.anydb.Data.Common.AppDatabase;
import com.hermesjunior.anydb.Data.Common.IRepository;
import com.hermesjunior.anydb.Data.Common.Task;

import java.util.List;

public class TemplateRepository implements IRepository<Template> {

    final private TemplateDAO templateDAO;

    public TemplateRepository(final Application application) {
        templateDAO = AppDatabase.getDatabase(application).templateDAO();
    }

    @Override
    public void insert(Template template) {
        new Task<Template>(templateDAO).insert(template);
    }

    @Override
    public LiveData<List<Template>> getAll() {
        return templateDAO.getAll();
    }

    @Override
    public LiveData<List<Template>> getFrom(String param) {
        return null;
    }

    @Override
    public void delete(Template template) {
        new Task<Template>(templateDAO).delete(template);
    }

    @Override
    public void deleteAll() {
        new Task<Template>(templateDAO).deleteAll();
    }
}
