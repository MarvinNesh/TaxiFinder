package com.taxifinder.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taxifinder.backend.model.TaxiRank;

@Repository
public interface TaxiRankRepository extends JpaRepository<TaxiRank, Long> {
}