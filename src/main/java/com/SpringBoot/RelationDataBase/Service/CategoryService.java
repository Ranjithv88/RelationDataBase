package com.SpringBoot.RelationDataBase.Service;

import com.SpringBoot.RelationDataBase.Model.Category;
import com.SpringBoot.RelationDataBase.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> CategoryGetApi() {
        return categoryRepository.findAll();
    }

    public String CategoryPostApi(Category category) {
        categoryRepository.save(category);
        return " Category Record Saved ! ";
    }

    public String CategoryPutApi(Category category) {
        categoryRepository.save(category);
        return " Category Record Update ! ";
    }

    public String CategoryDeleteApi(long categoryId) {
        categoryRepository.deleteById(categoryId);
        return " Delete Record Successfully !";
    }

    public String CategoryDeleteListApi(List<Long> categoryId) {
        for(Long category :categoryId) {
            categoryRepository.deleteById(category);
        }
        return " List of ID Deleted Successfully !";
    }

}
