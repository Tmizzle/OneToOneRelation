package com.JavaJPA.JavaJPA.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class AccountSettings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String language;
    private String theme;
    private String timezone;
    @OneToOne(targetEntity = Country.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_country", referencedColumnName = "id")
    private Country id_country;

}
