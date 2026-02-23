package com.example.CusTomBatchBackend.dtos;

import com.example.CusTomBatchBackend.enums.UserRole;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequest {


    @Positive(message = "Product id cannot be less than 0")
    private Long productId;

    @Positive(message = "Quantity cannot be less than 0")
    private Integer quantity;

    @Positive(message = "Supplier id cannot be less than 0")
    private Long supplier;


    private String description;

    private String note;
}
