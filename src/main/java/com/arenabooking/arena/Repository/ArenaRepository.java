package com.arenabooking.arena.Repository;

import com.arenabooking.arena.Model.Arena;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArenaRepository extends JpaRepository<Arena, Long> {
    List<Arena> findByClientNameContainingIgnoreCase(String clientName);


}
