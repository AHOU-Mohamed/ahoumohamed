package com.example.demo.repository;

import com.example.demo.entity.CategoriClient;
import com.example.demo.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Clientrepository extends JpaRepository<Client, Long> {

}
