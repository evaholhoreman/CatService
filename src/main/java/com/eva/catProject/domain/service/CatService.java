package com.eva.catProject.domain.service;

import com.eva.catProject.controller.dto.CatDTO;
import com.eva.catProject.domain.domainobject.Cat;
import com.eva.catProject.domain.exception.CatNameTooShortException;
import com.eva.catProject.domain.exception.CatNotFoundException;
import com.eva.catProject.repository.CatRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CatService {

    private CatRepository catRepository;

    public CatService(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    public Cat saveCat(CatDTO catToSave) {
        Cat newCat = new Cat(catToSave.getBreed(), catToSave.getColor(), catToSave.getName(), catToSave.getNumberOfSiblings());
        return catRepository.save(newCat);
    }

    public List<Cat> getCats() {
        return catRepository.findAll();
    }

    public void deleteCat(Long id) {
        Optional<Cat> catToDelete = catRepository.findById(id);
        if (catToDelete.isPresent()) {
            catRepository.delete(catToDelete.get());
        }
    }

    public Cat updateCat(Long id, CatDTO catToUpdate) {
        Optional<Cat> updatedCat = catRepository.findById(id);
        return catRepository.save(getUpdatedCat(catToUpdate, updatedCat, id));
    }

    private Cat getUpdatedCat(CatDTO catToUpdate, Optional<Cat> updatedCat, Long id) {
        if (updatedCat.isPresent()) {
            if (catToUpdate.getBreed() != null) {
                updatedCat.get().setBreed(catToUpdate.getBreed());
            }
            if (catToUpdate.getColor() != null) {
                updatedCat.get().setColor(catToUpdate.getColor());
            }
            if (catToUpdate.getName() != null) {
                updatedCat.get().setName(catToUpdate.getName());
            }
            if (catToUpdate.getAge() != null) {
                updatedCat.get().setAge(catToUpdate.getAge());
            }
            if (catToUpdate.getNumberOfSiblings() != null) {
                updatedCat.get().setNumberOfSiblings(catToUpdate.getNumberOfSiblings());
            }
            if (catToUpdate.isLivingWithSibling() != null) {
                updatedCat.get().setLivingWithSibling(catToUpdate.isLivingWithSibling());
            }
            if (catToUpdate.isHappy() != null) {
                updatedCat.get().setHappy(catToUpdate.isHappy());
            }
            if (catToUpdate.isHungry() != null) {
                updatedCat.get().setHungry(catToUpdate.isHungry());
            }
            return updatedCat.get();
        } else {
            throw new CatNotFoundException("Cat with id: " + id + " is not present");
        }
    }

    private void validateCatDTO(CatDTO cat){
        if(cat.getName().length() < 3){
            throw new CatNameTooShortException("Cat name needs to be a minimum of three characters");
        }
    }
}
