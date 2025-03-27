package com.satna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satna.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {



}
