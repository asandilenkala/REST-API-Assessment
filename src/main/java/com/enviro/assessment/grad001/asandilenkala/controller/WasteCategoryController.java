package com.enviro.assessment.grad001.asandilenkala.controller;

import com.enviro.assessment.grad001.asandilenkala.model.WasteCategory;
import com.enviro.assessment.grad001.asandilenkala.service.WasteCategoryServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * Controller class to handle API requests related to waste categories.
 */
@RestController
@RequestMapping("/api/categories")
public class WasteCategoryController {

    @Autowired
    private WasteCategoryServiceInterface service; // Service interface for waste category operations

    /**
     * Endpoint to create a new waste category.
     *
     * @param category The waste category to be created.
     * @return ResponseEntity with the created waste category and status CREATED.
     */
    @PostMapping
    public ResponseEntity<WasteCategory> createCategory(@Valid @RequestBody WasteCategory category) {
        // Calls the service to create the category and returns the created category with status CREATED
        return new ResponseEntity<>(service.createCategory(category), HttpStatus.CREATED);
    }

    /**
     * Endpoint to retrieve all waste categories.
     *
     * @return ResponseEntity containing a list of all waste categories.
     */
    @GetMapping
    public ResponseEntity<List<WasteCategory>> getAllCategories() {
        // Calls the service to get all categories and returns them with status OK
        return ResponseEntity.ok(service.getAllCategories());
    }

    /**
     * Endpoint to retrieve a waste category by its ID.
     *
     * @param id The ID of the waste category.
     * @return ResponseEntity containing the requested waste category.
     */
    @GetMapping("/{id}")
    public ResponseEntity<WasteCategory> getCategoryById(@PathVariable Long id) {
        // Calls the service to get a category by ID and returns it with status OK
        return ResponseEntity.ok(service.getCategoryById(id));
    }

    /**
     * Endpoint to update an existing waste category.
     *
     * @param id The ID of the category to be updated.
     * @param category The updated waste category data.
     * @return ResponseEntity containing the updated waste category.
     */
    @PutMapping("/{id}")
    public ResponseEntity<WasteCategory> updateCategory(@PathVariable Long id, @Valid @RequestBody WasteCategory category) {
        // Calls the service to update the category and returns the updated category with status OK
        return ResponseEntity.ok(service.updateCategory(id, category));
    }

    /**
     * Endpoint to delete a waste category by its ID.
     *
     * @param id The ID of the waste category to be deleted.
     * @return ResponseEntity with no content and status NO_CONTENT.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
        // Calls the service to delete the category and returns a response with status NO_CONTENT
        service.deleteCategory(id);
        return ResponseEntity.noContent().build();
    }

}
