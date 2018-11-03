package org.arbielezi.learning.mysfgpetclinic.services;

import org.arbielezi.learning.mysfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet  save(Vet vet);
    Set<Vet> findAll();
}
