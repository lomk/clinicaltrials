package ua.com.clinicaltrials.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.clinicaltrials.domain.Section;
import ua.com.clinicaltrials.repositories.SectionRepository;

/**
 * Created by Igor on 29-Sep-16.
 */
@Service
public class SectionServiceImpl implements SectionService {
    @Autowired
    SectionRepository sectionRepository;

    @Override
    public Iterable<Section> listAllSections() {
        return null;
    }

    @Override
    public Section getSectionById(Integer id) {
        return null;
    }

    @Override
    public void saveSection(Section Section) {

    }

    @Override
    public void deleteSection(Integer id) {

    }

    @Override
    public Section findByUrl(String url) {
        return null;
    }
}
