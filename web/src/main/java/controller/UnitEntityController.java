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


    @GetMapping("/unitEntity/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("unitEntity",new UnitEntity());
        return modelAndView;
    }


    @PostMapping("/UnitEntity/create")
    public ModelAndView create(@ModelAttribute("UnitEntity") UnitEntity unitEntity) {
        unitEntityManager.saveUnit(unitEntity);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("unitEntity", unitEntity);
        modelAndView.addObject("message","success");
        return modelAndView;
    }

    @RequestMapping(value = "/unitEntity")
    public ModelAndView list(Pageable pageable) {
        Page<UnitEntity> list = unitEntityManager.getAllUnit(pageable);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    @GetMapping("/unitEntity/edit/{id}")
    public ModelAndView showEditForm(@PathVariable String id) {
        Optional<UnitEntity> unitEntity = unitEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");

        modelAndView.addObject("unitEntity", unitEntity);
        return modelAndView;
    }


    @PostMapping("/unitEntity/edit")
    public ModelAndView edit(@ModelAttribute("unitEntity") UnitEntity unitEntity) {
        unitEntityManager.saveUnit(unitEntity);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("unitEntity",unitEntity);
        modelAndView.addObject("message","Success");
        return modelAndView;
    }

    @GetMapping("/unitEntity/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable String id) {

        Optional<UnitEntity> unitEntity = unitEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("unitEntity", unitEntity);
        return modelAndView;
    }

    @PostMapping("/unitEntity/delete")
    public ModelAndView delete(@ModelAttribute("unitEntity") UnitEntity unitEntity) {
        ModelAndView modelAndView = new ModelAndView("");
        unitEntityManager.deleteUnit(unitEntity.getId());
        modelAndView.addObject("message", "success");
        return modelAndView;
    }

    @GetMapping("/unitEntity/view/{id}")
    public ModelAndView show(@PathVariable String id) {
        Optional<UnitEntity> unitEntity = unitEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("unitEntity", unitEntity);

        return modelAndView;
    }
}
