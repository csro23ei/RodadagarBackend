package com.Rodadagar.Rodadagar;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<Note, Long> {
    List<Note> findByDate(String date);
}
