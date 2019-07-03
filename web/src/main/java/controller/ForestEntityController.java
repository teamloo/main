package controller;

import entity.ForestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.ForestEntityManager;
import java.util.Optional;
@Controller
public class ForestEntityController {

    @Autowired
    ForestEntityManager forestEntityManager;

    @GetMapping("/forestEntity/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("forestEntity",new ForestEntity());
        return modelAndView;
    }


    @PostMapping("/forestEntity/create")
    public ModelAndView create(@ModelAttribute("forestEntity") ForestEntity forestEntity) {
        forestEntityManager.saveForest(forestEntity);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("forestEntity", forestEntity);
        modelAndView.addObject("message","success");
        return modelAndView;
    }

    @GetMapping("/forestEntity")
    public ModelAndView list(Pageable pageable) {
        Page<ForestEntity> list = forestEntityManager.getAllForest(pageable);
        ModelAndView modelAndView = new ModelAndView("/forest/index");
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    @GetMapping("/forestEntity/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Optional<ForestEntity> forestEntity = forestEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");

        modelAndView.addObject("forestEntity", forestEntity);
        return modelAndView;
    }


    @PostMapping("/forestEntity/edit")
    public ModelAndView edit(@ModelAttribute("forestEntity") ForestEntity forestEntity) {
        forestEntityManager.saveForest(forestEntity);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("forestEntity",forestEntity);
        modelAndView.addObject("message","Success");
        return modelAndView;
    }

    @GetMapping("/forestEntity/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {

        Optional<ForestEntity> forestEntity = forestEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("forestEntity", forestEntity);
        return modelAndView;
    }

    @PostMapping("/forestEntity/delete")
    public ModelAndView delete(@ModelAttribute("forestEntity") ForestEntity forestEntity) {
        ModelAndView modelAndView = new ModelAndView("");
        forestEntityManager.removeForest(forestEntity.getId());
        modelAndView.addObject("message", "success");
        return modelAndView;
    }

    @GetMapping("/forestEntity/view/{id}")
    public ModelAndView show(@PathVariable Long id) {
        Optional<ForestEntity> forestEntity = forestEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("forestEntity", forestEntity);
        return modelAndView;
    }
}
