package com.projetTrans.prjetTrans.model;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "player")
public class Player {
    @Id
    @Column(name = "id_player")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id_player;

    @Column(name = "number")
    private int  number;

}
