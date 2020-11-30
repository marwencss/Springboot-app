package com.example.demo.entites;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data  @ToString
public class Produit implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String designation;
    private double price;
    private int quan ;


    public Produit(Long id, String designation, double price, int quan) {
        this.id = id;
        this.designation = designation;
        this.price = price;
        this.quan = quan;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produit() {
    }

    public Long getId() {
        return id;
    }


    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuan() {
        return quan;
    }

    public void setQuan(int quan) {
        this.quan = quan;
    }



}
