package com.cracken.bookseller.Repository.projection;

import java.time.LocalDateTime;

public interface I_PurchaseItem {

    String getTitle();
    Double getPrice();
    LocalDateTime getPurchaseTime();
}
