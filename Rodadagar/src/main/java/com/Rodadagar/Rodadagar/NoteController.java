package com.Rodadagar.Rodadagar;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/notes")
@CrossOrigin(origins = "*")
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping
    public Note createNote(@RequestBody Note note) {
        return noteService.save(note);
    }

    @DeleteMapping("/{id}")
    public void deleteNote(@PathVariable Long id) {
        noteService.delete(id);
    }

    @GetMapping
    public List<Note> getAllNotes() {
        return noteService.getAllNotes();
    }

    @SuppressWarnings("unchecked")
    @GetMapping("/date")
    public List<Note> getNotesByDate(@RequestParam String date) {
        return (List<Note>) noteService.getNotesByDate(date);
    }
}
