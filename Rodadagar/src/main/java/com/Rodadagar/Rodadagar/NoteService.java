package com.Rodadagar.Rodadagar;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NoteService {

    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public Note save(Note note) {
        return noteRepository.save(note);
    }

    public void delete(Long id) {
        noteRepository.deleteById(id);
    }

    public List<Note> getAllNotes() {
        return (List<Note>) noteRepository.findAll();
    }

    public org.hibernate.mapping.List getNotesByDate(String date) {
        return (org.hibernate.mapping.List) noteRepository.findByDate(date);
    }
}
