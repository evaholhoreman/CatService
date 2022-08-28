package com.eva.catProject.repository;

import com.eva.catProject.controller.dto.CatDTO;
import com.eva.catProject.domain.domainobject.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepository extends JpaRepository<Cat, Long> {




}
