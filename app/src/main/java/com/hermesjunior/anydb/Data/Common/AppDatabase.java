package com.hermesjunior.anydb.Data.Common;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.hermesjunior.anydb.Data.Item.Item;
import com.hermesjunior.anydb.Data.Item.ItemDAO;
import com.hermesjunior.anydb.Data.ItemContent.ItemContent;
import com.hermesjunior.anydb.Data.ItemContent.ItemContentDAO;
import com.hermesjunior.anydb.Data.Library.Library;
import com.hermesjunior.anydb.Data.Library.LibraryDAO;
import com.hermesjunior.anydb.Data.Template.Template;
import com.hermesjunior.anydb.Data.Template.TemplateDAO;

@Database(entities = {
        Item.class,
        ItemContent.class,
        Library.class,
        Template.class},
        version = 1)
@TypeConverters(DateConverter.class)
public abstract class AppDatabase extends RoomDatabase {

    public abstract ItemDAO itemDAO();

    public abstract ItemContentDAO itemContentDAO();
    public abstract TemplateDAO templateDAO();
    public abstract LibraryDAO libraryDAO();

    private static volatile AppDatabase INSTANCE;

    public static AppDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(
                    context.getApplicationContext(),
                    AppDatabase.class,
                    "main_database")
                    .build();
        }
        return INSTANCE;
    }
}
