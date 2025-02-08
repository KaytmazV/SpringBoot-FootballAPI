package com.volkankaytmaz.futbolapi.repository;

import com.volkankaytmaz.futbolapi.model.League;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaugeRepository extends JpaRepository<League, Long> {
}
