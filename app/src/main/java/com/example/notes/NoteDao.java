package com.example.notes;

import androidx.room.Dao;

import java.util.List;

@Dao
public interface NoteDao {
    void insert(Notes note);

    void delete(Notes note);

    List<Notes> getAllNotes();

}
