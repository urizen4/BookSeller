package com.cracken.bookseller.service;

import com.cracken.bookseller.Repository.projection.I_PurchaseItem;
import com.cracken.bookseller.models.Purchase;

import java.util.List;

public interface I_PurchaseService {
    Purchase savePurchase(Purchase purchase);



    List<I_PurchaseItem> findAllPurchaseUser(Long userId);

    void deletePurchase(Long id);
}
