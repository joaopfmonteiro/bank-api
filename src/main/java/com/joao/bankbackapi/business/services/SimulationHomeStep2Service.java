package com.joao.bankbackapi.business.services;

import com.joao.bankbackapi.business.persistant.SimulationContractedHomeEntity;
import com.joao.bankbackapi.business.persistant.SimulationHomeStep2Entity;
import com.joao.bankbackapi.business.persistant.repositories.SimulationHomeStep2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimulationHomeStep2Service {
    @Autowired
    private SimulationHomeStep2Repository simulationHomeStep2Repository;
    public List<SimulationHomeStep2Entity> findAllSimulationHomeStep2(){
        return simulationHomeStep2Repository.findAll();
    }
    public SimulationHomeStep2Entity findSimulationHomeStep2ById(Long id){
        return simulationHomeStep2Repository.getById(id);
    }
    public SimulationHomeStep2Entity saveSimulationHomeStep2(SimulationHomeStep2Entity simulation){
        return simulationHomeStep2Repository.save(simulation);
    }

}
