package com.enviro.assessment.grad001.asandilenkala.service;

import com.enviro.assessment.grad001.asandilenkala.model.WasteCategory;
import com.enviro.assessment.grad001.asandilenkala.repository.WasteCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class responsible for managing waste categories.
 * It provides methods to create, update, delete, and retrieve waste categories.
 */
@Service
public class WasteCategoryService implements WasteCategoryServiceInterface {

    @Autowired
    private WasteCategoryRepository repository;

    /**
     * Creates a new waste category and saves it to the database.
     *
     * @param category The waste category to be created.
     * @return The created waste category.
     */
    @Override
    public WasteCategory createCategory(WasteCategory category) {
        return repository.save(category);
    }

    /**
     * Updates an existing waste category by its ID.
     * If the category is found, it updates the category details and saves it.
     *
     * @param id The ID of the category to be updated.
     * @param category The new category details to be updated.
     * @return The updated waste category.
     * @throws IllegalArgumentException If the category with the given ID is not found.
     */
    @Override
    public WasteCategory updateCategory(Long id, WasteCategory category) {
        Optional<WasteCategory> existing = repository.findById(id);
        if (existing.isPresent()) {
            WasteCategory toUpdate = existing.get();
            toUpdate.setName(category.getName());
            toUpdate.setDescription(category.getDescription());
            return repository.save(toUpdate);
        } else {
            throw new IllegalArgumentException("Category not found");
        }
    }

    /**
     * Deletes a waste category by its ID.
     *
     * @param id The ID of the category to be deleted.
     */
    @Override
    public void deleteCategory(Long id) {
        repository.deleteById(id);
    }

    /**
     * Retrieves all waste categories from the database.
     *
     * @return A list of all waste categories.
     */
    @Override
    public List<WasteCategory> getAllCategories() {
        return repository.findAll();
    }

    /**
     * Retrieves a waste category by its ID.
     *
     * @param id The ID of the category to be retrieved.
     * @return The waste category with the given ID.
     * @throws IllegalArgumentException If the category with the given ID is not found.
     */
    @Override
    public WasteCategory getCategoryById(Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Category not found"));
    }
}
