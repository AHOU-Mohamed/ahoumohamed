package com.example.demo.service;

import com.example.demo.entity.Audio;
import com.example.demo.entity.Document;
import com.example.demo.repository.Audiorepository;
import com.example.demo.repository.Documentrepository;
import com.example.demo.repository.Livrerepository;
import com.example.demo.repository.videorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {

   @Autowired
   public Documentrepository documentrepository;




    public List<Document> getallDocuments(){
        return documentrepository.findAll();
    };
    public Document addDocument(Document document){
        return documentrepository.save(document);
    }
    public Document getDocumentById(Long documentId){
        return documentrepository.findById(documentId).orElse(null);
    }
    public void deleteDocument(Long clientId) {
        documentrepository.deleteById(clientId);
    }
    public Document updatedoc(Long documentId, String code, String titre, String auteur, String année,
                                 boolean empruntable, boolean emprunté, int nbEmprunts) {
        Document document1 = documentrepository.findById(documentId).orElseThrow(()-> new IllegalStateException("document with id "+ documentId + " does not exist "));
            document1.setCode(code);
            document1.setTitre(titre);
            document1.setAuteur(auteur);
            document1.setAnnée(année);
            document1.setEmpruntable(empruntable);
            document1.setEmprunté(emprunté);
            document1.setNbEmprunts(nbEmprunts);

            return documentrepository.save(document1);

    }








}
