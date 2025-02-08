package com.volkankaytmaz.futbolapi.repository;

import com.volkankaytmaz.futbolapi.model.Standings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StandingRepository extends JpaRepository<Standings, Long> {
}
