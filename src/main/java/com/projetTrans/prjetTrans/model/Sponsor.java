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
public class Sponsor {
    @Id
    @Column(name = "id_sponsor")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id_sponsor;

    @Column(name = "name")
    private int nameSponsor;

}

