package com.exam.examserver.Controller;



import com.exam.examserver.Entity.Exam.Category;
import com.exam.examserver.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryController {

    @Autowired
    CategoryService categoryService;


    @PostMapping("/")
    public ResponseEntity<?> addCategory(@RequestBody Category category) {
        Category category1 = this.categoryService.addCategory(category);
        return ResponseEntity.ok(category1);
    }

    @GetMapping("/{categoryId}")
    public Category getCategory(@PathVariable("categoryId") Long id) {
        return this.categoryService.getCategory(id);
    }

    @GetMapping("/")
    public Set<Category> getCategories() {
        return this.categoryService.getCategory();
    }

    @PutMapping("/")
    public Category updateCategory(@RequestBody Category category) {
        return  this.categoryService.updateCategory(category);
    }

    @DeleteMapping("/{categoryId}")
    public void deleteCategory(@PathVariable("categoryId") Long id) {
        this.categoryService.deleteCategory(id);
    }



}
