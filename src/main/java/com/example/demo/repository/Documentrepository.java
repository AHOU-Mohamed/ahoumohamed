package com.example.demo.repository;

import com.example.demo.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Documentrepository extends JpaRepository<Document, Long> {
}
