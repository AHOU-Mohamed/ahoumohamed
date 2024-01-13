package com.example.demo.service;

import com.example.demo.entity.Audio;
import com.example.demo.entity.Document;
import com.example.demo.repository.Audiorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class audioService {
    @Autowired
    public Audiorepository audiorepository;
    public List<Document> getallaudio(){
        return audiorepository.findAll();
    };
    public Document addAudio(Document document){
        return audiorepository.save(document);
    }
    public Document getAudioById(Long documentId){
        return audiorepository.findById(documentId).orElse(null);
    }
    public void deleteAudio(Long clientId) {
        audiorepository.deleteById(clientId);
    }

    public Audio updateAudio(Long audioId, String classification) {
        Document audio = audiorepository.findById(audioId)
                .orElseThrow(() -> new IllegalStateException("Audio with id " + audioId + " does not exist"));


        return (Audio) audiorepository.save(audio);
    }
}
