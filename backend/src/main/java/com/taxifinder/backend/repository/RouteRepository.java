package com.taxifinder.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taxifinder.backend.model.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {
}