package controller;

import entity.OffenceEntity;
import entity.UnlawfulEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.UnlawfulEntityManager;

import java.util.Optional;

@Controller
public class UnlawfulEntityController {
    @Autowired
    UnlawfulEntityManager unlawfulEntityManager;


    @GetMapping("/unlawfulEntity/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("unlawfulEntity",new UnlawfulEntity());
        return modelAndView;
    }


    @PostMapping("/unlawfulEntity/create")
    public ModelAndView create(@ModelAttribute("unlawfulEntity") UnlawfulEntity unlawfulEntity) {
        unlawfulEntityManager.saveUnlawful(unlawfulEntity);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("unlawfulEntity", unlawfulEntity);
        modelAndView.addObject("message","success");
        return modelAndView;
    }

    @RequestMapping(value = "/unlawfulEntity")
    public ModelAndView list(Pageable pageable) {
        Page<UnlawfulEntity> list = unlawfulEntityManager.getAllUnlawful(pageable);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    @GetMapping("/unlawfulEntity/edit/{id}")
    public ModelAndView showEditForm(@PathVariable String id) {
        Optional<UnlawfulEntity> unlawfulEntity = unlawfulEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");

        modelAndView.addObject("unlawfulEntity", unlawfulEntity);
        return modelAndView;
    }


    @PostMapping("/unlawfulEntity/edit")
    public ModelAndView edit(@ModelAttribute("unlawfulEntity") UnlawfulEntity unlawfulEntity) {
        unlawfulEntityManager.saveUnlawful(unlawfulEntity);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("unlawfulEntity",unlawfulEntity);
        modelAndView.addObject("message","Success");
        return modelAndView;
    }

    @GetMapping("/unlawfulEntity/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable String id) {

        Optional<UnlawfulEntity> unlawfulEntity = unlawfulEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("unlawfulEntity", unlawfulEntity);
        return modelAndView;
    }

    @PostMapping("/unlawfulEntity/delete")
    public ModelAndView delete(@ModelAttribute("unlawfulEntity") UnlawfulEntity unlawfulEntity) {
        ModelAndView modelAndView = new ModelAndView("");
        unlawfulEntityManager.deleteUnlawful(unlawfulEntity.getId());
        modelAndView.addObject("message", "success");
        return modelAndView;
    }

    @GetMapping("/unlawfulEntity/view/{id}")
    public ModelAndView show(@PathVariable String id) {
        Optional<UnlawfulEntity> unlawfulEntity = unlawfulEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("unlawfulEntity", unlawfulEntity);

        return modelAndView;
    }
}
