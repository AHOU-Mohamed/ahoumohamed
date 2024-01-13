package com.example.demo.repository;

import com.example.demo.entity.CategoriClient;
import com.example.demo.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Genrerepository extends JpaRepository<Genre,Long>{

}
