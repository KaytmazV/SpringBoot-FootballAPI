package com.volkankaytmaz.futbolapi.repository;

import com.volkankaytmaz.futbolapi.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
