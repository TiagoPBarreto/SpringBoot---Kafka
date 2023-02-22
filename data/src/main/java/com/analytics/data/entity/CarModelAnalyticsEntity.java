package com.analytics.data.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "car_model_analytics")
@Data
@NoArgsConstructor
public class CarModelAnalyticsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public String model;
    public Long posts;

}
