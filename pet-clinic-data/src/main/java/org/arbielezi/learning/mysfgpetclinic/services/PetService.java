package org.arbielezi.learning.mysfgpetclinic.services;

import org.arbielezi.learning.mysfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet  save(Pet pet);
    Set<Pet> findAll();
}
