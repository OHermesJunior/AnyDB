package com.hermesjunior.anydb.Repository;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "libraries")
public class Library {
    @PrimaryKey
    private String uuid;
    private String title;
    private String icon;
    private String desc;
    private String sort_template_uuid;
    private boolean sort_direction;
    private Date created_time;
}
