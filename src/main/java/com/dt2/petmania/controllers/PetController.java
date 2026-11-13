package com.dt2.petmania.controllers;

import com.dt2.petmania.entities.Pet;
import com.dt2.petmania.service.PetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pets")
public class PetController {
    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping
    public List<Pet> listar() {
        return petService.listarPets();
    }

    @PostMapping
    public Pet criar(@RequestBody Pet p) {
        return petService.criarPet(p);
    }
}