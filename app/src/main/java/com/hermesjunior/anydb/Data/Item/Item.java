package com.hermesjunior.anydb.Data.Item;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import com.hermesjunior.anydb.Data.Library.Library;

import java.util.Date;
import java.util.UUID;

@Entity(tableName = "items",
        foreignKeys = @ForeignKey(
            entity = Library.class,
            parentColumns = "uuid",
            childColumns = "lib_uuid"),
        indices = @Index(value = "lib_uuid"))
public class Item {

    @NonNull
    @PrimaryKey
    private String uuid;
    private String lib_uuid;
    private boolean removed;
    private Date created_time;
    private Date edited_time;
    private Date removed_time;

    public Item(String lib_uuid) {
        this.uuid = UUID.randomUUID().toString();
        this.lib_uuid = lib_uuid;
        this.removed = false;
        this.created_time = new Date();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getLib_uuid() {
        return lib_uuid;
    }

    public void setLib_uuid(String lib_uuid) {
        this.lib_uuid = lib_uuid;
    }

    public boolean isRemoved() {
        return removed;
    }

    public void setRemoved(boolean removed) {
        this.removed = removed;
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public Date getEdited_time() {
        return edited_time;
    }

    public void setEdited_time(Date edited_time) {
        this.edited_time = edited_time;
    }

    public Date getRemoved_time() {
        return removed_time;
    }

    public void setRemoved_time(Date removed_time) {
        this.removed_time = removed_time;
    }
}
