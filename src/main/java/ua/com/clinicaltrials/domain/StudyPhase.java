package ua.com.clinicaltrials.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Igor on 09-Oct-16.
 */
@Entity
@Table(name = "study_phase")
@Getter
@Setter
public class StudyPhase implements Serializable {
    private static final long serialVersionUID = -1009119478147252157L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String phase;
}
