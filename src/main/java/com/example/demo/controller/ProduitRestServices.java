package com.example.demo.controller;

import com.example.demo.dao.ProduitRepositry;
import com.example.demo.entites.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.List;

@CrossOrigin(origins="http://localhost:4200")

@RestController

public class ProduitRestServices {

    @Autowired
    private ProduitRepositry produitRepositry;
    @GetMapping(value="/listProduits")
    public List<Produit> list(){
        return produitRepositry.findAll();
    }
    @GetMapping(value = "/listProduits/{id}")
    public Produit listProduits(@PathVariable(name="id") Long id){
        return produitRepositry.findById( id ).get();}
    @CrossOrigin
    @PutMapping(value = "/listProduits/{id}")
        public Produit update(@PathVariable(name="id") Long id,@RequestBody Produit p){
        p.setId( id);
        return produitRepositry.save( p);
    }
    @PostMapping (value = "/listProduits")
    public Produit save(@RequestBody Produit p){

        return produitRepositry.save( p);}

    @CrossOrigin
    @DeleteMapping(value = "/listProduits/{id}")

    public void delete(@PathVariable(name="id") Long id) {

        produitRepositry.deleteById( id );
    }
}
