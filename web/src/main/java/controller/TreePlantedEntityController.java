package controller;

import entity.OffenceEntity;
import entity.TreePlantedEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.TreePlantedEntityManager;

import java.util.Optional;

@Controller
public class TreePlantedEntityController {
    @Autowired
    TreePlantedEntityManager treePlantedEntityManager;


    @GetMapping("/treePlantedEntity/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("treePlantedEntity",new OffenceEntity());
        return modelAndView;
    }


    @PostMapping("/treePlantedEntity/create")
    public ModelAndView create(@ModelAttribute("treePlantedEntity") TreePlantedEntity treePlantedEntity) {
        treePlantedEntityManager.saveTreePlanted(treePlantedEntity);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("treePlantedEntity", treePlantedEntity);
        modelAndView.addObject("message","success");
        return modelAndView;
    }

    @RequestMapping(value = "/treePlantedEntity")
    public ModelAndView list(Pageable pageable) {
        Page<TreePlantedEntity> list = treePlantedEntityManager.getAllTreePlanted(pageable);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    @GetMapping("/treePlantedEntity/edit/{id}")
    public ModelAndView showEditForm(@PathVariable String id) {
        TreePlantedEntity treePlantedEntity = treePlantedEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");

        modelAndView.addObject("treePlantedEntity", treePlantedEntity);
        return modelAndView;
    }


    @PostMapping("/treePlantedEntity/edit")
    public ModelAndView edit(@ModelAttribute("treePlantedEntity") TreePlantedEntity treePlantedEntity) {
        treePlantedEntityManager.saveTreePlanted(treePlantedEntity);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("treePlantedEntity",treePlantedEntity);
        modelAndView.addObject("message","Success");
        return modelAndView;
    }

    @GetMapping("/treePlantedEntity/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable String id) {

        TreePlantedEntity treePlantedEntity = treePlantedEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("treePlantedEntity", treePlantedEntity);
        return modelAndView;
    }

    @PostMapping("/treePlantedEntity/delete")
    public ModelAndView delete(@ModelAttribute("treePlantedEntity") TreePlantedEntity treePlantedEntity) {
        ModelAndView modelAndView = new ModelAndView("");
        treePlantedEntityManager.deleteTreePlanted(treePlantedEntity.getId());
        modelAndView.addObject("message", "success");
        return modelAndView;
    }

    @GetMapping("/treePlantedEntity/view/{id}")
    public ModelAndView show(@PathVariable String id) {
        TreePlantedEntity treePlantedEntity = treePlantedEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("treePlantedEntity", treePlantedEntity);

        return modelAndView;
    }
}
