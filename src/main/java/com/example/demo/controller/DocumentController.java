package com.example.demo.controller;

import com.example.demo.entity.Client;
import com.example.demo.entity.Document;
import com.example.demo.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/Document")
public class DocumentController {

    @Autowired
    DocumentService documentService;

    @GetMapping("/alldoc")
    public List<Document> Getallclient(){
        return this.documentService.getallDocuments();
    }

    @PostMapping("/adddoc")
    public Document addClient(@RequestBody Document document) {
        return documentService.addDocument(document);
    }

    @PutMapping("/updateDocument/{id}")
    public Document updateDocument(@PathVariable Long id,
                                   @RequestParam(required = false) String code,
                                   @RequestParam(required = false) String titre,
                                   @RequestParam(required = false) String auteur,
                                   @RequestParam(required = false) String année,
                                   @RequestParam(required = false) boolean empruntable,
                                   @RequestParam(required = false) boolean emprunté,
                                   @RequestParam(required = false) int nbEmprunts) {
        return documentService.updatedoc(id, code, titre, auteur, année, empruntable, emprunté, nbEmprunts);
    }

    @DeleteMapping("/deletedoc/{id}")
    public void deleteClient(@PathVariable Long id) {
        documentService.deleteDocument(id);
    }

}
