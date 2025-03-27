package com.satna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satna.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
