package com.example.demo.service;

import com.example.demo.entity.Document;
import com.example.demo.entity.Vidéo;
import com.example.demo.repository.Livrerepository;
import com.example.demo.repository.videorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class videoService {
    @Autowired
    videorepository videorepository;

    public Vidéo updateVideo(Long vidéoId, int duréeFilm, String mentionLégale) {
        Vidéo video = new Vidéo();
        Vidéo vid1 = (Vidéo) videorepository.findById(vidéoId).orElseThrow(() -> new IllegalStateException("Vidéo with id " + vidéoId + " does not exist"));

        vid1.setDuréeFilm(duréeFilm);
        vid1.setMentionLégale(mentionLégale);

        return videorepository.save(vid1);
    }

}
