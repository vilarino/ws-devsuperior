package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.repositories.SaleRepository;
import com.devsuperior.dsvendas.repositories.SellerRespository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {

    private final SaleRepository repository;
    private final SellerRespository sellerRespository;

    public SaleService(SaleRepository repository, SellerRespository sellerRespository) {
        this.repository = repository;
        this.sellerRespository = sellerRespository;
    }

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        // add result cache in memory and reduce quantity of sql executed in database.
        // Isn't recommended use when we have a lot of data to add in cache
        sellerRespository.findAll();

        Page<Sale> result = repository.findAll(pageable);
        return result.map(SaleDTO::new);
    }
}
