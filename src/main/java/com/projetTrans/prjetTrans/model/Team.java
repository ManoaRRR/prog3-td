package com.projetTrans.prjetTrans.model;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "team")
public class Team {
    @Id
    @Column(name = "id_team")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id_team;

    @Column(name = "team_name")
    private String team_name;
}
