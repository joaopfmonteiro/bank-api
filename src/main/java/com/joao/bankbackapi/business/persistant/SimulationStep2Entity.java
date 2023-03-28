package com.joao.bankbackapi.business.persistant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "simulator_home_step2")
public class SimulationStep2Entity {
    @Id
    private Long id;
    private String amount;
    @Column(name = "financed_amount")
    private String financed_amount;
    @Column(name = "mounths_needed")
    private String mounthsNeeded;
    @Column(name = "personal_networth")
    private String personalNetworth;
    private String age;
    @Column(name = "chronic_diseases")
    private String chronicDiseases;

}
