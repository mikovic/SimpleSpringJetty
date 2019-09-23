package com.geekbrains.service;

import com.geekbrains.entites.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface  ProductService {
    public Product findOneById(int id);
    public Product findByTitle(String title);
    public List<Product> findByCost(Double cost);
    public List<Product> findAll();
    public void addProduct(Product product);


}
