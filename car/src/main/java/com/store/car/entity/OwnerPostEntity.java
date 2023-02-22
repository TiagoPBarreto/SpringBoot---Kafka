package com.store.car.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "owner_post")
public class OwnerPostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Column(name = "owner_type")
    private String type;
    @Column(name = "owner_contact")
    private String contactNumber;
}
