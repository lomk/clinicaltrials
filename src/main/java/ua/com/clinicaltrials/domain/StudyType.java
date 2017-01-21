package ua.com.clinicaltrials.domain;

import javax.persistence.*;
import javax.persistence.criteria.Predicate;

/**
 * Created by Igor on 09-Oct-16.
 */
@Entity
@Table(name = "study_tape")
public class StudyType {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String type;
}
