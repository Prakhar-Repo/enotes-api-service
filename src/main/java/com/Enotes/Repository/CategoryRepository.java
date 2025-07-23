package com.Enotes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Enotes.Entity.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
