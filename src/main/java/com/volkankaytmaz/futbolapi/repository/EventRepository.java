package com.volkankaytmaz.futbolapi.repository;

import com.volkankaytmaz.futbolapi.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
