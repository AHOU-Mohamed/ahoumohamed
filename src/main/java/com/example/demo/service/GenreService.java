package com.example.demo.service;

import com.example.demo.entity.Client;
import com.example.demo.entity.Genre;
import com.example.demo.repository.Clientrepository;
import com.example.demo.repository.Genrerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GenreService {
    @Autowired
    public Genrerepository genrerepository;
    public List<Genre> getallclients(){
        return genrerepository.findAll();
    };
    public Genre addClient(Genre genre){
        return genrerepository.save(genre);
    }
    public Genre getClientById(Long clientId){
        return genrerepository.findById(clientId).orElse(null);
    }
    public void deleteClient(Long clientId) {
        genrerepository.deleteById(clientId);
    }
    public Genre updateGenre(Long genreId, int nbEmprunts, String nom) {
        Genre genre = genrerepository.findById(genreId)
                .orElseThrow(() -> new IllegalStateException("Genre with id " + genreId + " does not exist"));

        genre.setNbEmprunts(nbEmprunts);
        genre.setNom(nom);

        return genrerepository.save(genre);
    }
}
