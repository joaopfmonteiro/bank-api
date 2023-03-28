package com.joao.bankbackapi.business.services;

import com.joao.bankbackapi.business.persistant.SimulationStep2Entity;
import com.joao.bankbackapi.business.persistant.repositories.SimulationStep2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimulationStep2Service {
    @Autowired
    private SimulationStep2Repository simulationHomeStep2Repository;
    public List<SimulationStep2Entity> findAllSimulationHomeStep2(){
        return simulationHomeStep2Repository.findAll();
    }
    public SimulationStep2Entity findSimulationHomeStep2ById(Long id){
        return simulationHomeStep2Repository.getById(id);
    }
    public SimulationStep2Entity saveSimulationHomeStep2(SimulationStep2Entity simulation){
        return simulationHomeStep2Repository.save(simulation);
    }

}
