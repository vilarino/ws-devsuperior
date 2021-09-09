package com.devsuperior.dsvendas.repositories;

import com.devsuperior.dsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRespository extends JpaRepository<Seller, Long> {
}
