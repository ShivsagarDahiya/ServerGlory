package com.satna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satna.model.Product;
import com.satna.model.Review;
import com.satna.model.User;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review,Long> {
    List<Review> findReviewsByUserId(Long userId);
    List<Review> findReviewsByProductId(Long productId);
}
