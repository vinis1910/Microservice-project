package com.slloww.inventoryservice.services;

import com.slloww.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public boolean IsInStock(String skuCode){
        return inventoryRepository.findBySkuCode(skuCode).isPresent();
    }

}
