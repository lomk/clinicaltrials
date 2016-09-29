package ua.com.clinicaltrials.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.clinicaltrials.domain.Section;

/**
 * Created by Igor on 29-Sep-16.
 */
public interface SectionRepository extends JpaRepository<Section, Integer> {
    Section findByUrl(String url);
}
