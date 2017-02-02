package ua.com.clinicaltrials.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.clinicaltrials.domain.StudyPhase;

/**
 * Created by mater on 24-Jan-17.
 */
public interface StudyPhaseRepository extends JpaRepository<StudyPhase, Integer> {
}
