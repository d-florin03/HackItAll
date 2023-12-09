package com.veridion.hackathon.controller;

import com.veridion.hackathon.entity.Veridion;
import com.veridion.hackathon.service.VeridionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//TODO Aici sunt endpoint-urile pe care le apelati in Postman

@RestController
@RequestMapping("/api/veridion")
@RequiredArgsConstructor
public class VeridionController {

    private final VeridionService veridionService;

    @GetMapping("/get")
    public List<Veridion> get(){

        return veridionService.get();
    }

    @PostMapping("/post")
    public void create(@RequestBody Veridion veridion){

        veridionService.create(veridion);
    }

    @PutMapping(path = "/update/{id}")
    public void update(@PathVariable Long id, @RequestBody Veridion veridion){

        veridionService.update(id, veridion);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable Long id){

        veridionService.delete(id);
    }
}

