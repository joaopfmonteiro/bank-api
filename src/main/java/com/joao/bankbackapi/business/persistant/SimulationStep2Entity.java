package com.joao.bankbackapi.business.persistant;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Table(name = "simulator_home_step2")
public class SimulationStep2Entity {
    @Id
    @GeneratedValue
    private Long id;
    private Long amount;
    @Column(name = "financed_amount")
    private Long financed_amount;
    @Column(name = "mounths_needed")
    private Long mounthsNeeded;
    @Column(name = "personal_networth")
    private String personalNetworth;
    private Long age;
    @Column(name = "chronic_diseases")
    private String chronicDiseases;

}
