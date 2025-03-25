package com.ivoyant.main.filehandling.Serializable_Desrializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.ObjectOutputStream;
import java.io.Serial;
import java.io.Serializable;
@AllArgsConstructor
public class Employee implements Serializable  {
    @Serial
    private static final long serialVersionUID = 1L;
    String name;
    int age;
}

