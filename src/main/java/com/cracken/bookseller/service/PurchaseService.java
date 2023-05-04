package com.cracken.bookseller.service;

import com.cracken.bookseller.Repository.I_PurchaseRepository;
import com.cracken.bookseller.Repository.projection.I_PurchaseItem;
import com.cracken.bookseller.models.Purchase;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseService implements I_PurchaseService{

    private final I_PurchaseRepository purchaseRepository;


    public PurchaseService(I_PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }


    @Override
    public Purchase savePurchase(Purchase purchase){

        purchase.setPurchaseTime(LocalDateTime.now());
        return purchaseRepository.save(purchase);
    }

    @Override
    public List<I_PurchaseItem> findAllPurchaseUser(Long userId){

        return purchaseRepository.findAllPurchaseUser(userId);
    }

    @Override
    public void deletePurchase(Long id){
        purchaseRepository.deleteById(id);
    }
}
