package ua.com.clinicaltrials.domain;

import javax.persistence.*;

/**
 * Created by Igor on 09-Oct-16.
 */
@Entity
@Table(name = "study_design_time_perspective")
public class StudyDesignTimePerspective {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
}
