package com.example.microbruh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.microbruh.entity.HeatingMode;

public interface HeatingModeRepository extends JpaRepository<HeatingMode, Long> {
}

