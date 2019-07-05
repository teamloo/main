package controller;

import entity.DepartmentEntity;
import entity.ExploitionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.DepartmentEntityManager;
import service.ExploitionEntityManager;

import java.util.Optional;

@Controller
public class DepartmentEntityController {

    @Autowired
    ExploitionEntityManager exploitionEntityManager;

    @GetMapping("/create-exploition")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/exploition/create");
        modelAndView.addObject("exploition",new ExploitionEntity());
        return modelAndView;
    }


    @PostMapping("/create-exploition")
    public ModelAndView create(@ModelAttribute("exploition") ExploitionEntity exploitionEntity) {
        exploitionEntityManager.saveExploition(exploitionEntity);
        ModelAndView modelAndView = new ModelAndView("/exploition/create");
        modelAndView.addObject("exploition", exploitionEntity);
        modelAndView.addObject("message","success");
        return modelAndView;
    }

    @RequestMapping(value = "/exploition")
    public ModelAndView list(Pageable pageable) {
        Page<ExploitionEntity> list = exploitionEntityManager.getAllExploition(pageable);
        ModelAndView modelAndView = new ModelAndView("/exploition/list");
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    @GetMapping("/edit-exploition/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Optional<ExploitionEntity> exploitionEntity = exploitionEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("/exploition/edit");

        modelAndView.addObject("exploition", exploitionEntity);
        return modelAndView;
    }


    @PostMapping("/edit-exploition")
    public ModelAndView edit(@ModelAttribute("exploition") ExploitionEntity exploitionEntity) {
        exploitionEntityManager.saveExploition(exploitionEntity);
        ModelAndView modelAndView = new ModelAndView("/exploition/edit");
        modelAndView.addObject("exploition",exploitionEntity);
        modelAndView.addObject("message","Success");
        return modelAndView;
    }

    @GetMapping("/delete-exploition/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {

        ExploitionEntity exploitionEntity = exploitionEntityManager.findById(id).get();
        ModelAndView modelAndView = new ModelAndView("/exploition/delete");
        modelAndView.addObject("exploition", exploitionEntity);
        return modelAndView;
    }

    @PostMapping("/delete-exploition")
    public ModelAndView delete(@ModelAttribute("exploition") ExploitionEntity exploitionEntity) {
        ModelAndView modelAndView = new ModelAndView("/exploition/delete");
        exploitionEntityManager.removeExploition(exploitionEntity.getId());
        modelAndView.addObject("message", "success");
        return modelAndView;
    }

    @GetMapping("/view-exploition/{id}")
    public ModelAndView show(@PathVariable Long id) {
        ExploitionEntity exploitionEntity = exploitionEntityManager.findById(id).get();
        ModelAndView modelAndView = new ModelAndView("/exploition/view");
        modelAndView.addObject("exploition", exploitionEntity);
        return modelAndView;
    }

}





















