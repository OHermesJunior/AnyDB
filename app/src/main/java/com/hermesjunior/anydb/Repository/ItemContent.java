package com.hermesjunior.anydb.Repository;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

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
        indices = @Index(value = "item_uuid"))
public class ItemContent {
    @PrimaryKey
    private String uuid;
    private String item_uuid;
    private String template_uuid;
    private String string_value;
    private int int_value;
    private float real_value;

    public ItemContent(String item_uuid, String template_uuid, float real_value) {
        this.uuid = UUID.randomUUID().toString();
        this.item_uuid = item_uuid;
        this.template_uuid = template_uuid;
        this.real_value = real_value;
    }

    public ItemContent(String item_uuid, String template_uuid, int int_value) {
        this.uuid = UUID.randomUUID().toString();
        this.item_uuid = item_uuid;
        this.template_uuid = template_uuid;
        this.int_value = int_value;
    }

    public ItemContent(String item_uuid, String template_uuid, String string_value) {
        this.uuid = UUID.randomUUID().toString();
        this.item_uuid = item_uuid;
        this.template_uuid = template_uuid;
        this.string_value = string_value;
    }

    public String getUUID() {
        return uuid;
    }

    public void setUUID(String uuid) {
        this.uuid = uuid;
    }

    public String getItem_UUID() {
        return item_uuid;
    }

    public void setItem_UUID(String item_uuid) {
        this.item_uuid = item_uuid;
    }

    public String getTemplate_UUID() {
        return template_uuid;
    }

    public void setTemplate_UUID(String template_uuid) {
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
