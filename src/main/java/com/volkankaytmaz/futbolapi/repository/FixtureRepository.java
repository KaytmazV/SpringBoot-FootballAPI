package com.volkankaytmaz.futbolapi.repository;

import com.volkankaytmaz.futbolapi.model.Fixture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixtureRepository extends JpaRepository<Fixture, Long> {
}
