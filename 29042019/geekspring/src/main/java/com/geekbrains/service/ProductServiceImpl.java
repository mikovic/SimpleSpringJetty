package com.geekbrains.service;

import com.geekbrains.entites.Product;
import com.geekbrains.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
@Repository
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;


    @Override
    public Product findOneById(int id) {
        return productRepository.findOneById(id);
    }

    @Override
    public Product findByTitle(String title) {
        return null;
    }

    @Override
    public List<Product> findByCost(Double cost) {
        return productRepository.findOneByCost(cost);
    }


    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void addProduct(Product product) {
        this.productRepository.addProduct(product);
    }



}
