package com.example.demo.dao;

import com.example.demo.entites.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RepositoryRestResource
@CrossOrigin("*")
public interface ProduitRepositry extends JpaRepository<Produit,Long> {
    @RestResource(path="/byDesignation")
    public List<Produit> findByDesignation(@Param("mc") String des);
    @RestResource(path="/byDesignationPage")
    public Page<Produit> findByDesignationContains(@Param("mc") String des, Pageable pageable);

}
