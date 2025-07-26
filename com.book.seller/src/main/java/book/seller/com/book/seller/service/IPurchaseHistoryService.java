package book.seller.com.book.seller.service;

import book.seller.com.book.seller.model.PurchaseHistory;
import book.seller.com.book.seller.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchaseItemOfUser(Long userId);
}
