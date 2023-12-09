package com.veridion.hackathon.entity;

import jakarta.persistence.*;
import lombok.*;

//TODO Adaugati campuri in functie de nevoile voastre, mai exact de campurile pe care le aveti in baza de date

@Table(name = "Veridion")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Veridion {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
