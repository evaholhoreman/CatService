package com.eva.catProject.controller;

import com.eva.catProject.controller.dto.CatDTO;
import com.eva.catProject.domain.domainobject.Cat;
import com.eva.catProject.domain.service.CatService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cats")
public class CatController {

    private CatService catService;

    public CatController(CatService catService){
        this.catService = catService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cat addCat(@RequestBody CatDTO request){
        return catService.saveCat(request);
    }

    @GetMapping
    public List<Cat> getCats(){
        return catService.getCats();
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCat(@PathVariable Long id){
       catService.deleteCat(id);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Cat updateCat(@PathVariable Long id, @RequestBody CatDTO catToUpdate){
        return catService.updateCat(id, catToUpdate);

    }


}
