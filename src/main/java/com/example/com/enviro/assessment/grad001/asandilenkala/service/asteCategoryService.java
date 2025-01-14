package com.example.com.enviro.assessment.grad001.asandilenkala.service;

import com.example.com.enviro.assessment.grad001.asandilenkala.model.WasteCategory;
import com.example.com.enviro.assessment.grad001.asandilenkala.repository.WasteCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WasteCategoryService implements WasteCategoryServiceInterface {

    @Autowired
    private WasteCategoryRepository repository;

    @Override
    public WasteCategory createCategory(WasteCategory category) {
        return repository.save(category);
    }

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

    @Override
    public void deleteCategory(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<WasteCategory> getAllCategories() {
        return repository.findAll();
    }

    @Override
    public WasteCategory getCategoryById(Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Category not found"));
    }
}