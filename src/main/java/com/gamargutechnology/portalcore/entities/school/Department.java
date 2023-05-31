package com.gamargutechnology.portalcore.entities.school;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String departmentName;
    @Column(unique=true)
    private String departmentCode;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
    private Set<Program> programs;
}
