package ua.com.clinicaltrials.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.clinicaltrials.domain.Menu;

/**
 * Created by Igor on 29-Sep-16.
 */
public interface MenuRepository extends JpaRepository<Menu, Integer> {
}
