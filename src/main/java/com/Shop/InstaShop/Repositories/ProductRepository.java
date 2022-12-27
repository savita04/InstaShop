package com.Shop.InstaShop.Repositories;

import com.Shop.InstaShop.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer>{
}
