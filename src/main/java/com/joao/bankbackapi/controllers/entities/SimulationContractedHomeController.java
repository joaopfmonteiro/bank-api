package com.joao.bankbackapi.controllers.entities;

import com.joao.bankbackapi.business.persistant.SimulationContractedHomeEntity;
import com.joao.bankbackapi.business.services.SimulationContractedHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/simulation_contracted_home")
public class SimulationContractedHomeController {
    @Autowired
    public SimulationContractedHomeService simulationContractedHomeService;

    @GetMapping()
    public List<SimulationContractedHomeEntity> findAllSimulationContractedHome(){
        return simulationContractedHomeService.findAllSimulationContractedHome();
    }
    @GetMapping("/{id}")
    public SimulationContractedHomeEntity getSimulationContractedHomeById(@PathVariable Long id){
        return simulationContractedHomeService.findSimulationById(id);
    }
    @PostMapping()
    public SimulationContractedHomeEntity saveSimulationContractedHome(@RequestBody SimulationContractedHomeEntity simulation){
        return simulationContractedHomeService.saveSimulation(simulation);
    }
    @DeleteMapping("/{id}")
    public void deleteSimulation(@PathVariable Long id){
        simulationContractedHomeService.findSimulationById(id);
    }

}
