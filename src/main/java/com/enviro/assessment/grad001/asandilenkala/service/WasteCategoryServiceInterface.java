package com.enviro.assessment.grad001.asandilenkala.service;

import com.enviro.assessment.grad001.asandilenkala.model.WasteCategory;

import java.util.List;

/**
 * Interface defining the operations for managing waste categories.
 */
public interface WasteCategoryServiceInterface {

    /**
     * Creates a new waste category.
     *
     * @param category The waste category to be created.
     * @return The created waste category.
     */
    WasteCategory createCategory(WasteCategory category);

    /**
     * Updates an existing waste category by its ID.
     *
     * @param id The ID of the waste category to be updated.
     * @param category The new category data to update with.
     * @return The updated waste category.
     */
    WasteCategory updateCategory(Long id, WasteCategory category);

    /**
     * Deletes a waste category by its ID.
     *
     * @param id The ID of the waste category to be deleted.
     */
    void deleteCategory(Long id);

    /**
     * Retrieves all waste categories.
     *
     * @return A list of all waste categories.
     */
    List<WasteCategory> getAllCategories();

    /**
     * Retrieves a waste category by its ID.
     *
     * @param id The ID of the waste category to be retrieved.
     * @return The waste category with the specified ID.
     */
    WasteCategory getCategoryById(Long id);
}
