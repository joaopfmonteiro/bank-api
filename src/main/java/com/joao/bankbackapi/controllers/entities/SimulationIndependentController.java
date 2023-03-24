package com.joao.bankbackapi.controllers.entities;

import com.joao.bankbackapi.business.persistant.SimulationIndependentEntity;
import com.joao.bankbackapi.business.services.SimulationIndependentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/simulation_independent")
public class SimulationIndependentController {
    @Autowired
    private SimulationIndependentService simulationIndependentService;
    @GetMapping()
    public List<SimulationIndependentEntity> findAllSimulationIndependent(){
        return simulationIndependentService.findAllSimulationIndependent();
    }
    @GetMapping("/{id}")
    public SimulationIndependentEntity getSimulationIndependentById(@PathVariable Long id){
        return simulationIndependentService.findSimulationIndependentById(id);
    }
//    @PostMapping()
//    public SimulationIndependentEntity saveSimulationIndependentById(@RequestBody SimulationIndependentEntity simulation){
//        return simulationIndependentService.saveSimulationIndependent(simulation);
//    }
}
