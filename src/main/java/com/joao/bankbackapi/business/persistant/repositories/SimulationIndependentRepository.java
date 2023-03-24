package com.joao.bankbackapi.business.persistant.repositories;

import com.joao.bankbackapi.business.persistant.SimulationIndependentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SimulationIndependentRepository extends JpaRepository <SimulationIndependentEntity, Long> {
}
