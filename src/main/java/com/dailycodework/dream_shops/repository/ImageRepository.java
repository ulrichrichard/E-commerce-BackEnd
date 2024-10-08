package com.dailycodework.dream_shops.repository;

import com.dailycodework.dream_shops.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Long> {
    List<Image> findByProductId(Long id);
}
