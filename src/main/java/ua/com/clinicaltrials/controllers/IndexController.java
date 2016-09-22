package ua.com.clinicaltrials.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.com.clinicaltrials.services.ArticleService;
import ua.com.clinicaltrials.services.CategoryService;
import ua.com.clinicaltrials.services.TagService;

/**
 * Created by Igor on 09-Jun-16.
 */
@Controller
public class IndexController {
    @Autowired
    TagService tagService;
    @Autowired
    CategoryService categoryService;
    @Autowired
    ArticleService articleService;

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public ModelAndView welcomePage(Model model) {

        model.addAttribute("tags", tagService.listAllTags());
        return new ModelAndView("index");
    }
}
