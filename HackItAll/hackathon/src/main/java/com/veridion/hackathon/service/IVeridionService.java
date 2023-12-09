package com.veridion.hackathon.service;

import com.veridion.hackathon.entity.Veridion;

import java.util.List;

//TODO Adaugati aici semnatura metodei pe care o adaugati in Service

public interface IVeridionService {

    List<Veridion> get();
    void create(Veridion veridion);
    void update(Long id, Veridion veridion);
    void delete(Long id);
}
