package com.joao.bankbackapi.controllers.entities;

import com.joao.bankbackapi.business.persistant.SimulationStep2Entity;
import com.joao.bankbackapi.business.services.SimulationStep2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/simulation_home_step2")
public class SimulationHomeController {
    @Autowired
    private SimulationStep2Service simulationHomeStep2Service;
    @GetMapping()
    public List<SimulationStep2Entity> findAllSimulationHomeStep2(){
        return simulationHomeStep2Service.findAllSimulationHomeStep2();
    }
    @GetMapping("/{id}")
    public SimulationStep2Entity getSimulationHomeById(@PathVariable Long id){
        return simulationHomeStep2Service.findSimulationHomeStep2ById(id);
    }
    @PostMapping()
    public SimulationStep2Entity saveSimulationHome(@RequestBody SimulationStep2Entity simulation){
        return simulationHomeStep2Service.saveSimulationHomeStep2(simulation);
    }
}
