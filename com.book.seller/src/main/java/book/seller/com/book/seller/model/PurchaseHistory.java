package book.seller.com.book.seller.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "purchase_history")
public class PurchaseHistory {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "userId",nullable = false)
    private Long userId;

    @Column(name = "bookId",nullable = false)
    private Long bookId;

    @Column(name = "price",nullable = false)
    private Double price;

    @Column(name = "purchaseTime",nullable = false)
    private LocalDateTime purchaseTime;
}
