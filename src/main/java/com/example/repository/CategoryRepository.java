package com.example.repository;

import com.example.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, String>
{
    List<CategoryEntity> findAllByIsDeleted(boolean isDeleted);
    @Query("select e.categoryName from CategoryEntity e where e.categoryId in :categoriesId and e.isDeleted = 0")
    List<String> getCategoryNamesByIds (@Param("categoriesId") List<Integer> categoriesId);
}
