package ua.com.clinicaltrials.domain;

import javax.persistence.*;

/**
 * Created by mater on 21-Jan-17.
 */
@Entity
@Table(name = "recruitment_status")
public class RecruitmentStatus {
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
