package com.Shop.InstaShop.Repositories;

import com.Shop.InstaShop.Models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Integer> {
}
