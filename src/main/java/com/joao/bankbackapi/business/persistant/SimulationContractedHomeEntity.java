package com.joao.bankbackapi.business.persistant;

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
@Table(name = "simulation_contracted_home")

public class SimulationContractedHomeEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String company;
    @Column(name = "company_social_number")
    private String companySocialNumber;
    @Column(name = "time_working")
    private String timeWorking;
    @Column(name = "net_salary")
    private String netSalary;
    @Column(name = "company_line_of_work")
    private String companyLineOfWork;
    @Column(name = "worker_time")
    private String workerType;
    @Column(name = "product_to_simulate")
    private String productToSimulate;
}
