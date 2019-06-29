package jungle.controller;


import entity.ForestFireEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.ForestFireEntityManager;

@Controller
public class ForestFireEntityController {

    @Autowired
    ForestFireEntityManager forestFireEntityManager;



    @GetMapping("/forestFireEntity/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("forestFireEntity",new ForestFireEntity());
        return modelAndView;
    }


    @PostMapping("/forestFireEntity/create")
    public ModelAndView create(@ModelAttribute("forestFireEntity") ForestFireEntity forestFireEntity) {
        forestFireEntityManager.saveForestFire(forestFireEntity);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("forestFireEntity", forestFireEntity);
        modelAndView.addObject("message","success");
        return modelAndView;
    }

    @RequestMapping(value = "/forestFireEntity")
    public ModelAndView list(Pageable pageable) {
        Page<ForestFireEntity> list = forestFireEntityManager.getAllForestFire(pageable);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    @GetMapping("/forestFireEntity/edit/{id}")
    public ModelAndView showEditForm(@PathVariable String id) {
        ForestFireEntity forestFireEntity = forestFireEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");

        modelAndView.addObject("forestFireEntity", forestFireEntity);
        return modelAndView;
    }


    @PostMapping("/forestFireEntity/edit")
    public ModelAndView edit(@ModelAttribute("forestFireEntity") ForestFireEntity forestFireEntity) {
        forestFireEntityManager.saveForestFire(forestFireEntity);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("forestFireEntity",forestFireEntity);
        modelAndView.addObject("message","Success");
        return modelAndView;
    }

    @GetMapping("/forestFireEntity/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable String id) {

        ForestFireEntity forestFireEntity = forestFireEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("foreforestFireEntitystEntity", forestFireEntity);
        return modelAndView;
    }

    @PostMapping("/forestFireEntity/delete")
    public ModelAndView delete(@ModelAttribute("forestFireEntity") ForestFireEntity forestFireEntity) {
        ModelAndView modelAndView = new ModelAndView("");
        forestFireEntityManager.removeForestFire(forestFireEntity.getId());
        modelAndView.addObject("message", "success");
        return modelAndView;
    }

    @GetMapping("/forestFireEntity//view/{id}")
    public ModelAndView show(@PathVariable String id) {
        ForestFireEntity forestFireEntity = forestFireEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("forestFireEntity", forestFireEntity);
        return modelAndView;
    }
}
