package controller;

import entity.OffenceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.OffenceEntityManager;

import java.util.Optional;

@Controller
public class OffenceEntityController {
    @Autowired
    OffenceEntityManager offenceEntityManager;


    @GetMapping("/offenceEntity/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/offence/create");
        modelAndView.addObject("offenceEntity",new OffenceEntity());
        return modelAndView;
    }


    @PostMapping("/offenceEntity/create")
    public ModelAndView create(@ModelAttribute("offenceEntity") OffenceEntity offenceEntity) {
        offenceEntityManager.saveOffence(offenceEntity);
        ModelAndView modelAndView = new ModelAndView("/offence/create");
        modelAndView.addObject("offenceEntity", offenceEntity);
        modelAndView.addObject("message","success");
        return modelAndView;
    }

    @RequestMapping(value = "/offenceEntity")
    public ModelAndView list(Pageable pageable) {
        Page<OffenceEntity> list = offenceEntityManager.getAllOffence(pageable);
        ModelAndView modelAndView = new ModelAndView("/offence/list");
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    @GetMapping("/offenceEntity/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Optional<OffenceEntity> offenceEntity = offenceEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");

        modelAndView.addObject("offenceEntity", offenceEntity);
        return modelAndView;
    }


    @PostMapping("/offenceEntity/edit")
    public ModelAndView edit(@ModelAttribute("offenceEntity") OffenceEntity offenceEntity) {
        offenceEntityManager.saveOffence(offenceEntity);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("offenceEntity",offenceEntity);
        modelAndView.addObject("message","Success");
        return modelAndView;
    }

    @GetMapping("/offenceEntity/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {

        Optional<OffenceEntity> offenceEntity = offenceEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("offenceEntity", offenceEntity);
        return modelAndView;
    }

    @PostMapping("/offenceEntity/delete")
    public ModelAndView delete(@ModelAttribute("offenceEntity") OffenceEntity offenceEntity) {
        ModelAndView modelAndView = new ModelAndView("");
        offenceEntityManager.removeOffence(offenceEntity.getId());
        modelAndView.addObject("message", "success");
        return modelAndView;
    }

    @GetMapping("/offenceEntity/view/{id}")
    public ModelAndView show(@PathVariable Long id) {
        Optional<OffenceEntity> offenceEntity = offenceEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("offenceEntity", offenceEntity);

        return modelAndView;
    }
}
