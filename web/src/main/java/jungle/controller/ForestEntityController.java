package jungle.controller;

import entity.ForestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.ForestEntityManager;

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

    @RequestMapping(value = "/forestEntity")
    public ModelAndView list(Pageable pageable) {
        Page<ForestEntity> list = forestEntityManager.getAllForest(pageable);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    @GetMapping("/exploitionEntity/edit/{id}")
    public ModelAndView showEditForm(@PathVariable String id) {
        ForestEntity forestEntity = forestEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");

        modelAndView.addObject("forestEntity", forestEntity);
        return modelAndView;
    }


    @PostMapping("/exploitionEntity/edit")
    public ModelAndView edit(@ModelAttribute("forestEntity") ForestEntity forestEntity) {
        forestEntityManager.saveForest(forestEntity);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("forestEntity",forestEntity);
        modelAndView.addObject("message","Success");
        return modelAndView;
    }

    @GetMapping("/exploitionEntity/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable String id) {

        ForestEntity forestEntity = forestEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("forestEntity", forestEntity);
        return modelAndView;
    }

    @PostMapping("/exploitionEntity/delete")
    public ModelAndView delete(@ModelAttribute("forestEntity") ForestEntity forestEntity) {
        ModelAndView modelAndView = new ModelAndView("");
        forestEntityManager.removeForest(forestEntity.getId());
        modelAndView.addObject("message", "success");
        return modelAndView;
    }

    @GetMapping("/exploitionEntity//view/{id}")
    public ModelAndView show(@PathVariable String id) {
        ForestEntity forestEntity = forestEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("forestEntity", forestEntity);
        return modelAndView;
    }
}
