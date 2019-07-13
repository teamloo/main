package controller;

import entity.UnitEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.UnitEntityManager;

import java.util.Optional;
@Controller
public class UnitEntityController {
    @Autowired
    UnitEntityManager unitEntityManager;

    @GetMapping("/create-unit")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/unit/create");
        modelAndView.addObject("unitEntity",new UnitEntity());
        return modelAndView;
    }


    @PostMapping("/create-unit")
    public ModelAndView create(@ModelAttribute("unitEntity") UnitEntity unitEntity) {
        unitEntityManager.saveUnit(unitEntity);
        ModelAndView modelAndView = new ModelAndView("/unit/create");
        modelAndView.addObject("unitEntity", unitEntity);
        //modelAndView.addObject("message","success");
        return modelAndView;
    }

    @RequestMapping(value = "/unit")
    public ModelAndView list(Pageable pageable) {
        Page<UnitEntity> list = unitEntityManager.getAllUnit(pageable);
        ModelAndView modelAndView = new ModelAndView("/unit/list");
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    @GetMapping("/edit-unit/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Optional<UnitEntity> unitEntity = unitEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("/unit/update");

        modelAndView.addObject("unitEntity", unitEntity);
        return modelAndView;
    }


    @PostMapping("/edit-unit")
    public ModelAndView edit(@ModelAttribute("unitEntity") UnitEntity unitEntity) {
        unitEntityManager.saveUnit(unitEntity);
        ModelAndView modelAndView = new ModelAndView("/unit/update");
        modelAndView.addObject("unitEntity",unitEntity);
        modelAndView.addObject("message","Success");
        return modelAndView;
    }

    @GetMapping("/delete-unit/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {

        Optional<UnitEntity> unitEntity = unitEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("/unit/delete");
        modelAndView.addObject("unitEntity", unitEntity);
        return modelAndView;
    }

    @PostMapping("/delete-unit")
    public ModelAndView delete(@ModelAttribute("unitEntity") UnitEntity unitEntity) {
        ModelAndView modelAndView = new ModelAndView("/unit/delete");
        unitEntityManager.deleteUnit(unitEntity.getId());
        modelAndView.addObject("message", "success");
        return modelAndView;
    }

    @GetMapping("/unitEntity/view/{id}")
    public ModelAndView show(@PathVariable Long id) {
        Optional<UnitEntity> unitEntity = unitEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("unitEntity", unitEntity);
        return modelAndView;
    }
}
