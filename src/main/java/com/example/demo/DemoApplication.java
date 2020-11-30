package com.example.demo;

import com.example.demo.dao.ProduitRepositry;
import com.example.demo.entites.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private ProduitRepositry produitRepositry;
	//@Autowired
	//private RepositoryRestConfiguration restConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		//restConfiguration.exposeIdsFor( Produit.class );
		produitRepositry.save( new Produit(null,"dell", 5825, 84 ) );
		produitRepositry.save( new Produit(null,"HP", 4500, 100 ) );
		produitRepositry.save( new Produit(null,"Lenovo", 5000, 200 ) );
		produitRepositry.save( new Produit(null,"Azus", 5600, 300 ) );
		produitRepositry.save( new Produit(null,"versus", 600, 30 ) );
		produitRepositry.findAll().forEach( p -> {System.out.println(p.toString());} );
	}
}
