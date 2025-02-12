package com.enviro.assessment.grad001.asandilenkala.repository;

import com.enviro.assessment.grad001.asandilenkala.model.WasteCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for handling CRUD operations related to WasteCategory entities.
 * This interface extends JpaRepository to leverage built-in methods for managing WasteCategory entities.
 * <p>
 * WasteCategoryRepository provides methods for storing, retrieving, updating, and deleting WasteCategory
 * objects from the database. The repository is automatically implemented by Spring Data JPA.
 * </p>
 */
public interface WasteCategoryRepository extends JpaRepository<WasteCategory, Long> {
    // This interface extends JpaRepository, so it already inherits CRUD methods like save(), findById(), findAll(), deleteById(), etc.
}
