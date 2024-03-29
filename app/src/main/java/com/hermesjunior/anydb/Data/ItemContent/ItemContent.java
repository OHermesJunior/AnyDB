package com.hermesjunior.anydb.Data.ItemContent;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import com.hermesjunior.anydb.Data.Item.Item;
import com.hermesjunior.anydb.Data.Template.Template;

import java.util.UUID;

@Entity(tableName = "item_content",
        foreignKeys = {
        @ForeignKey(
                entity = Item.class,
                parentColumns = "uuid",
                childColumns = "item_uuid"),
        @ForeignKey(entity = Template.class,
                parentColumns = "uuid",
                childColumns = "template_uuid")},
        indices = {@Index(value = "item_uuid"), @Index(value = "template_uuid")})
public class ItemContent {

    @NonNull
    @PrimaryKey
    private String uuid;
    private String item_uuid;
    private String template_uuid;
    private String string_value;
    private int int_value;
    private float real_value;

    public ItemContent(String item_uuid, String template_uuid, float real_value, int int_value, String string_value) {
        this.uuid = UUID.randomUUID().toString();
        this.item_uuid = item_uuid;
        this.template_uuid = template_uuid;
        this.real_value = real_value;
        this.int_value = int_value;
        this.string_value = string_value;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getItem_uuid() {
        return item_uuid;
    }

    public void setItem_uuid(String item_uuid) {
        this.item_uuid = item_uuid;
    }

    public String getTemplate_uuid() {
        return template_uuid;
    }

    public void setTemplate_uuid(String template_uuid) {
        this.template_uuid = template_uuid;
    }

    public String getString_value() {
        return string_value;
    }

    public void setString_value(String string_value) {
        this.string_value = string_value;
    }

    public int getInt_value() {
        return int_value;
    }

    public void setInt_value(int int_value) {
        this.int_value = int_value;
    }

    public float getReal_value() {
        return real_value;
    }

    public void setReal_value(float real_value) {
        this.real_value = real_value;
    }
}
