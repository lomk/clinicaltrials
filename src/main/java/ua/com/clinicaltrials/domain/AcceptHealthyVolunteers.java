package ua.com.clinicaltrials.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Igor on 10-Oct-16.
 */
@Entity
@Table(name = "accept_healthy_volunteers")
public class AcceptHealthyVolunteers implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "value_ua")
    private String valueUA;

    @Column(name = "value_ru")
    private String valueRU;

    @Column(name = "value_en")
    private String valueEN;
}
