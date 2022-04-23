package com.example.schoolhospital.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("Teacher")
public class Teacher extends User {

    //we need to create an entity called School (ie: we replace String by School)
    private String school;



}