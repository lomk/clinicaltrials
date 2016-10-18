package ua.com.clinicaltrials.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Igor on 07-Oct-16.
 */
@Entity
@Table(name = "study_status")
public class StudyStatus implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "status_ua")
    private String statusUA;

    @Column(name = "status_ru")
    private String statusRU;

    @Column(name = "status_en")
    private String statusEN;
}
