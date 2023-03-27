package com.joao.bankbackapi.controllers.entities;

import com.joao.bankbackapi.business.persistant.SimulationHomeStep2Entity;
import com.joao.bankbackapi.business.services.SimulationHomeStep2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/simulation_home_step2")
public class SimulationHomeStep2Controller {
    @Autowired
    private SimulationHomeStep2Service simulationHomeStep2Service;
    @GetMapping()
    public List<SimulationHomeStep2Entity> findAllSimulationHomeStep2(){
        return simulationHomeStep2Service.findAllSimulationHomeStep2();
    }
    @GetMapping("/{id}")
    public SimulationHomeStep2Entity getSimulationHomeById(@PathVariable Long id){
        return simulationHomeStep2Service.findSimulationHomeStep2ById(id);
    }
    @PostMapping()
    public SimulationHomeStep2Entity saveSimulationHome(@RequestBody SimulationHomeStep2Entity simulation){
        return simulationHomeStep2Service.saveSimulationHomeStep2(simulation);
    }
}
