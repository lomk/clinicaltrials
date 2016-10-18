package ua.com.clinicaltrials.domain;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

/**
 * Created by Igor on 09-Oct-16.
 */
@Entity
@Table(name = "study_phase")
public class StudyPhase {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String phase;
}
