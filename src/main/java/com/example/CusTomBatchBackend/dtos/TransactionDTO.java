package com.example.CusTomBatchBackend.dtos;


import com.example.CusTomBatchBackend.enums.TransactionStatus;
import com.example.CusTomBatchBackend.enums.TransactionType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionDTO {


    private Long id;

    private Integer totalProducts;

    private BigDecimal totalPrice;

    private TransactionType transactionType;

    private TransactionStatus status;

    private String description;

    private String note;

    private  LocalDateTime createdAt;

    private LocalDateTime updatedAt;


    private ProductDTO product;


    private UserDTO user;


    private SupplierDTO supplier;


}
