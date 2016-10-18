package ua.com.clinicaltrials.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Igor on 10-Oct-16.
 */
@Entity
@Table(name = "eligibility")
public class Eligibility implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "min_age")
    private int minAge;

    @Column(name = "max_age")
    private int maxAge;

    @ManyToOne
    @JoinColumn(name = "gender_id")
    private Gender gender;

    @ManyToOne
    @JoinColumn(name = "accept_healthy_volunteers_id")
    private AcceptHealthyVolunteers acceptHealthyVolunteers;

    @Column(name = "inclusion_criteria")
    private String inclusionCriteria;

    @Column(name = "exclusion_criteria")
    private String exclusionCriteria;
}
