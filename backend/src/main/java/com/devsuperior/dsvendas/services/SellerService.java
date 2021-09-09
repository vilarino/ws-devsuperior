package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repositories.SellerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRespository respository;

    public List<SellerDTO> findAll() {
        List<Seller> result = respository.findAll();

        return result.stream().map(SellerDTO::new).collect(Collectors.toList());
    }
}
