package com.example.test3.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "test_data")
@NoArgsConstructor
@AllArgsConstructor
public class TestDataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seq;

    private String id;

    private String tData;
}
