package com.joao.bankbackapi.business.services;

import com.joao.bankbackapi.business.persistant.SimulationContractedHomeEntity;
import com.joao.bankbackapi.business.persistant.repositories.SimulationContractedHomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimulationContractedHomeService {
    @Autowired
    private SimulationContractedHomeRepository simulationContractedHomeRepository;
    public List<SimulationContractedHomeEntity> findAllSimulationContractedHome(){
        return simulationContractedHomeRepository.findAll();
    }
    public SimulationContractedHomeEntity findSimulationById(Long id){
        return simulationContractedHomeRepository.getById(id);
    }
    public SimulationContractedHomeEntity saveSimulation(SimulationContractedHomeEntity simulation){
        return simulationContractedHomeRepository.save(simulation);
    }
    public void updateSimulation(SimulationContractedHomeEntity simulation) {
        simulationContractedHomeRepository.save(simulation);
    }
    public void deleteSimulation(Long id){
        simulationContractedHomeRepository.deleteById(id);
    }
}
