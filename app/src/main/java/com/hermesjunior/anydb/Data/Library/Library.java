package com.hermesjunior.anydb.Data.Library;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;
import java.util.UUID;

@Entity(tableName = "libraries")
public class Library {

    @NonNull
    @PrimaryKey
    private String uuid;
    private String title;
    private String icon;
    private String desc;
    private String sort_template_uuid;
    private boolean sort_direction;
    private Date created_time;

    public Library(String title, String icon, String desc, String sort_template_uuid, boolean sort_direction) {
        this.uuid = UUID.randomUUID().toString();
        this.created_time = new Date();
        this.title = title;
        this.icon = icon;
        this.desc = desc;
        this.sort_template_uuid = sort_template_uuid;
        this.sort_direction = sort_direction;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSort_template_uuid() {
        return sort_template_uuid;
    }

    public void setSort_template_uuid(String sort_template_uuid) {
        this.sort_template_uuid = sort_template_uuid;
    }

    public boolean isSort_direction() {
        return sort_direction;
    }

    public void setSort_direction(boolean sort_direction) {
        this.sort_direction = sort_direction;
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }
}
