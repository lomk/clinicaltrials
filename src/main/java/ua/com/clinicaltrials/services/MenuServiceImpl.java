package ua.com.clinicaltrials.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.clinicaltrials.domain.Menu;

/**
 * Created by Igor on 29-Sep-16.
 */
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuService menuService;

    @Override
    public Iterable<Menu> listAllMenues() {
        return null;
    }

    @Override
    public Menu getMenuById(Integer id) {
        return null;
    }

    @Override
    public void deleteMenu(Integer id) {

    }

    @Override
    public void save(Menu Menu) {

    }

    @Override
    public Menu findByName(String name) {
        return null;
    }
}
