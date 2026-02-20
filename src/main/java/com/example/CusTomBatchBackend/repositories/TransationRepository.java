package com.example.CusTomBatchBackend.repositories;

import com.example.CusTomBatchBackend.models.Category;
import com.example.CusTomBatchBackend.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TransationRepository extends JpaRepository<Transaction,Long>, JpaSpecificationExecutor<Transaction> {
    
}
