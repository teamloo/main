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


    @GetMapping("/create-treePlanted")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/treePlanted/create");
        modelAndView.addObject("treePlantedEntity",new OffenceEntity());
        return modelAndView;
    }


    @PostMapping("/create-treePlanted")
    public ModelAndView create(@ModelAttribute("treePlantedEntity") TreePlantedEntity treePlantedEntity) {
        treePlantedEntityManager.saveTreePlanted(treePlantedEntity);
        ModelAndView modelAndView = new ModelAndView("/treePlanted/create");
        modelAndView.addObject("treePlantedEntity", treePlantedEntity);
        modelAndView.addObject("message","success");
        return modelAndView;
    }

    @RequestMapping(value = "/treePlanted")
    public ModelAndView list(Pageable pageable) {
        Page<TreePlantedEntity> list = treePlantedEntityManager.getAllTreePlanted(pageable);
        ModelAndView modelAndView = new ModelAndView("/treePlanted/index2");
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    @GetMapping("/edit-treePlanted/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Optional<TreePlantedEntity> treePlantedEntity = treePlantedEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("/treePlanted/update");

        modelAndView.addObject("treePlantedEntity", treePlantedEntity);
        return modelAndView;
    }


    @PostMapping("/edit-treePlanted")
    public ModelAndView edit(@ModelAttribute("treePlantedEntity") TreePlantedEntity treePlantedEntity) {
        treePlantedEntityManager.saveTreePlanted(treePlantedEntity);
        ModelAndView modelAndView = new ModelAndView("/treePlanted/update");
        modelAndView.addObject("treePlantedEntity",treePlantedEntity);
        modelAndView.addObject("message","Success");
        return modelAndView;
    }

    @GetMapping("/delete-treePlanted/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {

        Optional<TreePlantedEntity> treePlantedEntity = treePlantedEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("/treePlanted/delete");
        modelAndView.addObject("treePlantedEntity", treePlantedEntity);
        return modelAndView;
    }

    @PostMapping("/delete-treePlanted")
    public ModelAndView delete(@ModelAttribute("treePlantedEntity") TreePlantedEntity treePlantedEntity) {
        ModelAndView modelAndView = new ModelAndView("/treePlanted/delete");
        treePlantedEntityManager.deleteTreePlanted(treePlantedEntity.getId());
        modelAndView.addObject("message", "success");
        return modelAndView;
    }

    @GetMapping("/view-treePlanted/{id}")
    public ModelAndView show(@PathVariable Long id) {
        Optional<TreePlantedEntity> treePlantedEntity = treePlantedEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("treePlantedEntity", treePlantedEntity);

        return modelAndView;
    }
}
