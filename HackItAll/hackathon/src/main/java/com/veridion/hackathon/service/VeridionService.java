package com.veridion.hackathon.service;

import com.veridion.hackathon.entity.Veridion;
import com.veridion.hackathon.repository.VeridionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

//TODO Completati service-ul in functie de nevoile voastre, aici sunt cele 4 metode de baza
@Service
@RequiredArgsConstructor
public class VeridionService implements IVeridionService{

    private final VeridionRepository veridionRepository;

    @Override
    public List<Veridion> get() {

        return null;
    }

    @Override
    public void create(Veridion veridion) {

    }

    @Override
    public void update(Long id, Veridion veridion) {

    }

    @Override
    public void delete(Long id) {

    }
}
