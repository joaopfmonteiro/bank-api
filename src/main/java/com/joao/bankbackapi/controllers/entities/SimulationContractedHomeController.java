package com.joao.bankbackapi.controllers.entities;

import com.joao.bankbackapi.business.persistant.SimulationContractedHomeEntity;
import com.joao.bankbackapi.business.services.SimulationContractedHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
        SimulationContractedHomeEntity simulation = simulationContractedHomeService.findSimulationById(id);

        if(simulation==null)
            throw new SimulationNotFoundExeception("id:"+ id);
        return simulation;
    }
    @PostMapping()
    public ResponseEntity <SimulationContractedHomeEntity> saveSimulationContractedHome(@RequestBody SimulationContractedHomeEntity simulation){
        SimulationContractedHomeEntity savedSimulation = simulationContractedHomeService.saveSimulation(simulation);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedSimulation.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
    @PutMapping()
    public void updateSimulation(@RequestBody SimulationContractedHomeEntity simulation){
        simulationContractedHomeService.updateSimulation(simulation);
    }
    @DeleteMapping("/{id}")
    public void deleteSimulation(@PathVariable Long id){
        simulationContractedHomeService.deleteSimulation(id);
    }

}
