package com.geekbrains.repositories;

import com.geekbrains.entites.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    private int id =1;
    private List<Product> products;
    public ProductRepository(){
        this.products=new ArrayList<>();
        Product pech = new Product();
        pech.setCost(10);
        pech.setId(id);
        pech.setTitle("Груша");
        products.add(pech);
    }
    public Product findOneById(int id) {
        Product product = null;
        for (Product pd : this.products){
           if (pd.getId() == id){
               product =pd;
               break;
           }
        }
        return product;
    }

    public List<Product> findOneByCost(Double cost) {
        List<Product> list = null;
        for (Product pd : this.products) {
            if (pd.getCost() == cost) {
                list.add(pd);
                break;
            }
        }
        return list;
    }
    public void addProduct(Product product) {
        id++;
        product.setId(id);
        this.products.add(product);
    }
    public List<Product> findAll() {
        return this.products;
    }

}
