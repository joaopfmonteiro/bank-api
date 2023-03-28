package com.joao.bankbackapi.business.services;

import com.joao.bankbackapi.business.persistant.SimulationIndependentEntity;
import com.joao.bankbackapi.business.persistant.repositories.SimulationIndependentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimulationIndependentService {
    @Autowired
    private SimulationIndependentRepository simulationIndependentRepository;
    public List<SimulationIndependentEntity> findAllSimulationIndependent(){
        return simulationIndependentRepository.findAll();
    }
    public SimulationIndependentEntity findSimulationIndependentById(Long id){
        return simulationIndependentRepository.getById(id);
    }
    public SimulationIndependentEntity saveSimulationIndependent(SimulationIndependentEntity simulation){
        return simulationIndependentRepository.save(simulation);
    }
    public void updateSimulation(SimulationIndependentEntity simulation){
        simulationIndependentRepository.save(simulation);
    }
    public void deleteSimulation(Long id){
        simulationIndependentRepository.deleteById(id);
    }

}
