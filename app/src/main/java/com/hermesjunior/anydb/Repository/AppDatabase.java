package com.hermesjunior.anydb.Repository;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {
        Item.class,
        ItemContent.class,
        Library.class,
        Template.class},
        version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ItemDAO itemDao();
    public abstract ItemContentDAO itemContentDao();
    public abstract TemplateDAO templateDAO();
    public abstract LibraryDAO libraryDAO();

    private static volatile AppDatabase INSTANCE;

    static AppDatabase getDatabase(final Context context) {
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
