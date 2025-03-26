package com.ivoyant.springboot.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;
@Entity
@Data
public class Restaurant {
    @Id
    @GeneratedValue
    private int id;
    @Column(unique=true)
    private String food;
    private String category;
    @Column(nullable = false)
    private double price;
}
