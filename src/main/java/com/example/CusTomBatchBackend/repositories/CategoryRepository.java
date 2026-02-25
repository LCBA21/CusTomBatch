package com.example.CusTomBatchBackend.repositories;

import com.example.CusTomBatchBackend.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
