package ua.com.clinicaltrials.domain;

import javax.persistence.*;

/**
 * Created by Igor on 09-Oct-16.
 */
@Entity
@Table(name = "phase")
public class Phase {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

}