/*
 * Author Name:
 * Date: 11/22/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package com.niit.jdp.ProductofshoppingApplication.service;

import com.niit.jdp.ProductofshoppingApplication.domain.Product;
import com.niit.jdp.ProductofshoppingApplication.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
@Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;

    }


    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductById(int productId) {
        return productRepository.findByProductId(productId);
    }

    @Override
    public boolean deleteProductById(int productId) {
         productRepository.deleteById(productId);
          return true;
    }
}