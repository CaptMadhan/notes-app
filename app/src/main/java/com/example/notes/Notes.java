package com.example.notes;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "notes_table")
public class Notes {
    @ColumnInfo(name = "text") String text;
    @PrimaryKey(autoGenerate = true)int id=0;
    Notes(String text){
        this.text=text;

    }
}
