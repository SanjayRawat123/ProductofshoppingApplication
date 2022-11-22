package com.niit.jdp.ProductofshoppingApplication.service;

import com.niit.jdp.ProductofshoppingApplication.domain.Product;

import java.util.List;

public interface ProductService {
    Product addProduct(Product product);

    List<Product>getAllProduct();




    List<Product> getProductById(int productId);

    boolean deleteProductById(int productId);

}
