package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UnitEntityController {
    @Autowired
    OffenceEntityManager offenceEntityManager;


    @GetMapping("/offenceEntity/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("departmentEntity",new OffenceEntity());
        return modelAndView;
    }


    @PostMapping("/offenceEntity/create")
    public ModelAndView create(@ModelAttribute("offenceEntity") OffenceEntity offenceEntity) {
        offenceEntityManager.saveOffence(offenceEntity);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("offenceEntity", offenceEntity);
        modelAndView.addObject("message","success");
        return modelAndView;
    }

    @RequestMapping(value = "/offenceEntity")
    public ModelAndView list(Pageable pageable) {
        Page<OffenceEntity> list = offenceEntityManager.getAllOffence(pageable);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    @GetMapping("/offenceEntity/edit/{id}")
    public ModelAndView showEditForm(@PathVariable String id) {
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
    public ModelAndView showDeleteForm(@PathVariable String id) {

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
    public ModelAndView show(@PathVariable String id) {
        Optional<OffenceEntity> offenceEntity = offenceEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("offenceEntity", offenceEntity);

        return modelAndView;
    }
}
