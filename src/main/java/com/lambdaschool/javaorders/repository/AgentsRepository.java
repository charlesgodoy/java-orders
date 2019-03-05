package com.lambdaschool.javaorders.repository;

import com.lambdaschool.javaorders.model.Agents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentsRepository extends JpaRepository<Agents, Long> {
}
