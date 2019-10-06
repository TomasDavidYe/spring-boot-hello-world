package com.tomaye.example.bank.repository;

import com.tomaye.example.bank.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Impemented by
@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}