package com.tandf.informa.ecommerce.gt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tandf.informa.ecommerce.gt.models.Products;


@Repository
public interface ProductRepository extends JpaRepository<Products, Long>  {
	
	


}
