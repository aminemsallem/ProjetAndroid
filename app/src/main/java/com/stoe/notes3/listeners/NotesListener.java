package com.stoe.notes3.listeners;

import com.stoe.notes3.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);

}
