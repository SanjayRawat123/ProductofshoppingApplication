/*
 * Author Name:
 * Date: 11/22/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package com.niit.jdp.ProductofshoppingApplication.controller;

import com.niit.jdp.ProductofshoppingApplication.domain.Product;
import com.niit.jdp.ProductofshoppingApplication.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productData")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping(value = "/product")
    public ResponseEntity<?> addProduct(@RequestBody Product product) {
        return new ResponseEntity<>(productService.addProduct(product), HttpStatus.CREATED);
    }

    @GetMapping(value = "/products")
    public ResponseEntity<?> getAllProducts() {
        return new ResponseEntity<>(productService.getAllProduct(), HttpStatus.OK);
    }

    @DeleteMapping(value = "/product/{productId}")
    public ResponseEntity<?> deleteProduct(@PathVariable int productId) {
        return new ResponseEntity<>(productService.deleteProductById(productId), HttpStatus.OK);
    }

    @GetMapping(value = "/product/{productId}")
    public ResponseEntity<?> getProductByProductId(@PathVariable int productId) {
        return new ResponseEntity<>(productService.getProductById(productId), HttpStatus.OK);
    }
}
