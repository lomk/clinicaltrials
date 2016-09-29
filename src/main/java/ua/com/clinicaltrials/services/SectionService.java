package ua.com.clinicaltrials.services;

import ua.com.clinicaltrials.domain.Section;

/**
 * Created by Igor on 29-Sep-16.
 */
public interface SectionService {
    Iterable<Section> listAllSections();

    Section getSectionById(Integer id);

    void saveSection(Section Section);

    void deleteSection(Integer id);

    Section findByUrl(String url);
}
