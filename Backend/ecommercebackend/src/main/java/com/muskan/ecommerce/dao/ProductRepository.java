package com.muskan.ecommerce.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.muskan.ecommerce.entity.Product;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {
//	behind the scenes- select*from product where category_id=?
	Page<Product> findByCategoryId(@Param("Id") Long id, Pageable pageable);
	//select*from product p where p.name like concat('%', :name,'%')
	Page<Product> findByNameContainingIgnoreCase(@RequestParam("name") String name, Pageable pageable);
}
