package com.cgpr.mineurpenal;

import java.io.Serializable;
import java.sql.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "enf")
public class Enfant  implements Serializable {
    @Id
    private String id;
    private String nom;
    private String prenom;










}
