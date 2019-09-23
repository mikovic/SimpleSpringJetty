package com.geekbrains.controllers;

import com.geekbrains.entites.Product;
import com.geekbrains.entites.Student;
import com.geekbrains.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public String showProductById(Model uiModel, @PathVariable("id") int id) {
        Product product = productService.findOneById(id);
        uiModel.addAttribute("product", product);
        return "show-product";
    }


    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public String list(Model uiModel) {
        List<Product> products = productService.findAll();
        uiModel.addAttribute("products", products);
        return "allproducts";
    }

    @RequestMapping(path ="/add",method = RequestMethod.GET)
    public String showSimpleForm(Model uiModel) {
        Product product = new Product();
        uiModel.addAttribute("product", product);
        return "product-form";
    }
    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("product") Product product) {
        productService.addProduct(product);
        return   "redirect:/products/all";
    }

}
