package com.hermesjunior.anydb.Data.Template;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import com.hermesjunior.anydb.Data.Library.Library;

@Entity(tableName = "template",
        foreignKeys = @ForeignKey(
                entity = Library.class,
                parentColumns = "uuid",
                childColumns = "lib_uuid"),
        indices = @Index(value = "lib_uuid"))
public class Template {

    @NonNull
    @PrimaryKey
    private String uuid;
    private String lib_uuid;
    private int order_number;
    private String title;
    private String type;
    private String hint;
    private boolean autofill;
    private boolean notnull;

    public Template(String lib_uuid, String title, String type, String hint, boolean autofill, boolean notnull) {
        this.lib_uuid = lib_uuid;
        this.title = title;
        this.type = type;
        this.hint = hint;
        this.autofill = autofill;
        this.notnull = notnull;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public boolean isAutofill() {
        return autofill;
    }

    public void setAutofill(boolean autofill) {
        this.autofill = autofill;
    }

    public boolean isNotnull() {
        return notnull;
    }

    public void setNotnull(boolean notnull) {
        this.notnull = notnull;
    }

    public int getOrder_number() {
        return order_number;
    }

    public void setOrder_number(int order_number) {
        this.order_number = order_number;
    }

}