package com.payment.action.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Document(collection = "payments")
public class Payment {
    @Id
    private String id;
    private String customerId;
    private BigDecimal amount;
    private String currency;
    private String status;
    private LocalDateTime createdAt = LocalDateTime.now();
}
