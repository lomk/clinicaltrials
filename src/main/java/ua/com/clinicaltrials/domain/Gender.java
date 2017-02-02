package ua.com.clinicaltrials.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Igor on 10-Oct-16.
 */
@Entity
@Table(name = "gender")
@Getter
@Setter
public class Gender implements Serializable {
    private static final long serialVersionUID = -1000119478147274757L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name_ua")
    private String nameUA;
    @Column(name = "name_ru")
    private String nameRU;
    @Column(name = "name_en")
    private String nameEN;
}
