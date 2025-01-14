package com.example.com.enviro.assessment.grad001.asandilenkala.service;

import com.example.com.enviro.assessment.grad001.asandilenkala.model.WasteCategory;

import java.util.List;

public interface WasteCategoryServiceInterface {
    WasteCategory createCategory(WasteCategory category);
    WasteCategory updateCategory(Long id, WasteCategory category);
    void deleteCategory(Long id);
    List<WasteCategory> getAllCategories();
    WasteCategory getCategoryById(Long id);
}
