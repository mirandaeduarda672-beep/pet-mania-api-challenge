package com.dt2.petmania.service;

import com.dt2.petmania.entities.Pet;
import com.dt2.petmania.repositories.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {
    private final PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public Pet criarPet(Pet pet) {
        return petRepository.save(pet);
    }

    public List<Pet> listarPets() {
        return petRepository.findAll();
    }
}