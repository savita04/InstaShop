package com.Shop.InstaShop.Controllers;

import com.Shop.InstaShop.Exception.NotAvailableException;
import com.Shop.InstaShop.Repositories.CartRepository;
import com.Shop.InstaShop.Repositories.ProductInStockRepository;
import com.Shop.InstaShop.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Shop.InstaShop.Models.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

@Autowired
 ProductRepository productRepository;

@Autowired
ProductInStockRepository productInStockRepository;

@Autowired
CartRepository cartRepository;

@PostMapping
public Product addProduct(@RequestBody Product product)
{
 return productRepository.saveAndFlush(product);
}

@GetMapping
@RequestMapping("{id}")
 public Product getProductById(@PathVariable int id)
{
 return productRepository.findById(id).get();
}

@GetMapping
 public List<Product> getAllProduct()
{
 return productRepository.findAll();
}

@RequestMapping("/addProductStock")
@PostMapping
 public ProductStock addProductStock(@RequestBody ProductStock productStock){
 return productInStockRepository.saveAndFlush(productStock);
}

@RequestMapping("/getAllproductStocks")
@GetMapping
 public List<ProductStock> getAllproductStocks(){
 return productInStockRepository.findAll();
}


 @GetMapping
@RequestMapping("/getProductStockById/{id}")
 public ProductStock getProductStockById(@PathVariable int id){
 return productInStockRepository.findById(id).get();
}

@PostMapping
 @RequestMapping("/addToCart")
 public Cart addToCart(@RequestBody Cart cart){
 return cartRepository.saveAndFlush(cart);
}

@GetMapping
 @RequestMapping("/viewCart")
 public List<Cart> viewCart() {
    return cartRepository.findAll();
}
}
