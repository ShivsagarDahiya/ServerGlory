package com.satna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satna.model.HomeCategory;

public interface HomeCategoryRepository extends JpaRepository<HomeCategory,Long> {
}
