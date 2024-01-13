package com.example.demo.service;

import com.example.demo.entity.Livre;
import com.example.demo.repository.Livrerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivreService {

    @Autowired
    public Livrerepository livreRepository;

    public Livre updateLivre(Long livreId, int nombrePage) {
        Livre livre = (Livre) livreRepository.findById(livreId)
                .orElseThrow(() -> new IllegalStateException("Livre with id " + livreId + " does not exist"));

        livre.setNombrePage(nombrePage);

        return livreRepository.save(livre);
    }
}
