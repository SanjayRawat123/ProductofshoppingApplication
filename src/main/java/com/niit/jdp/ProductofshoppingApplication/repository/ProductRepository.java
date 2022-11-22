/*
 * Author Name:
 * Date: 11/22/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package com.niit.jdp.ProductofshoppingApplication.repository;

import com.niit.jdp.ProductofshoppingApplication.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    List<Product> findByProductId(int productId);



}
