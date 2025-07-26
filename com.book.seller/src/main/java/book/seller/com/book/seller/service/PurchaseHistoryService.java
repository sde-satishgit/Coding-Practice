package book.seller.com.book.seller.service;

import book.seller.com.book.seller.model.PurchaseHistory;
import book.seller.com.book.seller.repository.IPurchaseHistoryRepository;
import book.seller.com.book.seller.repository.projection.IPurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseHistoryService implements IPurchaseHistoryService{

    @Autowired
    private IPurchaseHistoryRepository iPurchaseHistoryRepository;

    @Override
    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory){
        purchaseHistory.setPurchaseTime(LocalDateTime.now());
        return iPurchaseHistoryRepository.save(purchaseHistory);
    }


    @Override
    public List<IPurchaseItem> findPurchaseItemOfUser(Long userId){
        return  iPurchaseHistoryRepository.findAllPurchaseOfUser(userId);
    }
}
