package controller;


import entity.ForestEntity;
import entity.ForestFireEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.ForestEntityManager;
import service.ForestFireEntityManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@Controller
public class ForestFireEntityController {

    @Autowired
    ForestFireEntityManager forestFireEntityManager;

    @Autowired
    ForestEntityManager forestEntityManager;

    @ModelAttribute("forestList")
    Iterable<ForestEntity> unitList(Pageable pageable) {
        return forestEntityManager.getAllForest(pageable);
    }

    @GetMapping("/forestFireEntity/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/forestFire/create");
        modelAndView.addObject("forestFireEntity", new ForestFireEntity());
        return modelAndView;
    }

    @PostMapping("/forestFireEntity/create")
    public ModelAndView create(@ModelAttribute("forestFireEntity") ForestFireEntity forestFireEntity) {
        forestFireEntityManager.saveForestFire(forestFireEntity);
        ModelAndView modelAndView = new ModelAndView("/forestFire/create");
        modelAndView.addObject("forestFire", forestFireEntity);
        modelAndView.addObject("message", "success");
        return modelAndView;
    }

    @RequestMapping(value = "/forestFireEntity")
    public ModelAndView list(Pageable pageable) {
        Page<ForestFireEntity> list = forestFireEntityManager.getAllForestFire(pageable);
        ModelAndView modelAndView = new ModelAndView("/forestFire/list");
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    @GetMapping("/forestFireEntity/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Optional<ForestFireEntity> forestFireEntity = forestFireEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("/forestFire/edit");

        modelAndView.addObject("forestFireEntity", forestFireEntity);
        return modelAndView;
    }

    @PostMapping("/forestFireEntity/edit")
    public ModelAndView edit(@ModelAttribute("forestFireEntity") ForestFireEntity forestFireEntity) {
        forestFireEntityManager.saveForestFire(forestFireEntity);
        ModelAndView modelAndView = new ModelAndView("redirect:/forestFireEntity");
        modelAndView.addObject("forestFire", forestFireEntity);
        modelAndView.addObject("message", "Success");
        return modelAndView;
    }
    @GetMapping("/forestFireEntity/delete/{id}")
    public ModelAndView deleteForm(@PathVariable Long id) {
        Optional<ForestFireEntity> forestFireEntity = forestFireEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("/forestFire/delete");

        modelAndView.addObject("forestFireEntity", forestFireEntity);
        return modelAndView;
    }

    @PostMapping("/forestFireEntity/delete")
    public ModelAndView delete(@ModelAttribute("forestFireEntity") ForestFireEntity forestFireEntity) {
        forestFireEntityManager.removeForestFire(forestFireEntity.getId());
        ModelAndView modelAndView = new ModelAndView("redirect:/forestFireEntity");
        modelAndView.addObject("forestFire", forestFireEntity);
        modelAndView.addObject("message", "Success");
        return modelAndView;
    }
}
