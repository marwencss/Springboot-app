package com.example.demo.entites;

import org.springframework.data.rest.core.config.Projection;

@Projection( name="p1",types=Produit.class )
public interface ProduitProjection {
    public double getPrice();
    public String getDesignation();
}
