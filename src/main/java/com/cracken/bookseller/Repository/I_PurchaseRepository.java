package com.cracken.bookseller.Repository;

import com.cracken.bookseller.Repository.projection.I_PurchaseItem;
import com.cracken.bookseller.models.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface I_PurchaseRepository extends JpaRepository<Purchase,Long> {

    @Query("select" + " b.title as title,ph.price as price,ph.purchaseTime as purchaseTime" +
            " from Purchase ph left join Book b on b.id = ph.bookId"+" where ph.userId = : userId ")
    List<I_PurchaseItem>findAllPurchaseUser(@Param("userId") Long userId);
}
