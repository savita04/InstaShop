package com.Shop.InstaShop.Repositories;

import com.Shop.InstaShop.Models.ProductStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInStockRepository extends JpaRepository<ProductStock,Integer> {

}
