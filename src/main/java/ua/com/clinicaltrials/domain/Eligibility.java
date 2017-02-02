package ua.com.clinicaltrials.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Igor on 10-Oct-16.
 */
@Entity
@Table(name = "eligibility")
@Getter
@Setter
public class Eligibility implements Serializable {
    private static final long serialVersionUID = -1000119478147212357L;

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

    @Column(name = "inclusion_criteria_ua")
    private String inclusionCriteriaUA;
    @Column(name = "inclusion_criteria_ru")
    private String inclusionCriteriaRU;
    @Column(name = "inclusion_criteria_en")
    private String inclusionCriteriaEN;

    @Column(name = "exclusion_criteria_ua")
    private String exclusionCriteriaUA;
    @Column(name = "exclusion_criteria_ru")
    private String exclusionCriteriaRU;
    @Column(name = "exclusion_criteria_en")
    private String exclusionCriteriaEN;
}
