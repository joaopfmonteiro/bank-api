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
@Table(name = "s_independent")

public class SimulationIndependentEntity {
    @Id
    @GeneratedValue()
    private Long id;
    @Column(name = "social_number")
    private Long socialNumber;
    @Column(name = "time_as_Independent")
    private long timeAsIndependent;
    @Column(name = "avarage_monthly_income")
    private long avarageMonthlyIncome;
    @Column(name = "anual_income")
    private long anualIncome;
    @Column(name = "line_of_work")
    private String lineOfWork;
    @Column(name = "worker_type")
    private String workerType;
    @Column(name = "product_to_simulate")
    private String productToSimulate;

}
