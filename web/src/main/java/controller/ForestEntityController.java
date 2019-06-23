package controller;

import entity.ForestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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


    @PostMapping("/exploitionEntity/create")
    public ModelAndView create(@ModelAttribute("exploitionEntity") ExploitionEntity exploitionEntity) {
        exploiEntityManager.saveExploition(exploitionEntity);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("exploitionEntity", exploitionEntity);
        modelAndView.addObject("message","success");
        return modelAndView;
    }

    @RequestMapping(value = "/exploitionEntity")
    public ModelAndView list(Pageable pageable) {
        Page<ExploitionEntity> list = exploiEntityManager.getAllExploition(pageable);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    @GetMapping("/editExploitionEntity/{id}")
    public ModelAndView showEditForm(@PathVariable String id) {
        Optional<ExploitionEntity> exploitionEntity = exploiEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");

        modelAndView.addObject("exploitionEntity", exploitionEntity);
        return modelAndView;
    }


    @PostMapping("/editExploitionEntity")
    public ModelAndView edit(@ModelAttribute("exploitionEntity") ExploitionEntity exploitionEntity) {
        exploiEntityManager.saveExploition(exploitionEntity);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("exploitionEntity",exploitionEntity);
        modelAndView.addObject("message","Success");
        return modelAndView;
    }

    @GetMapping("/deleteExploitionEntity/{id}")
    public ModelAndView showDeleteForm(@PathVariable String id) {

        Optional<ExploitionEntity> exploitionEntity = exploiEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("exploitionEntity", exploitionEntity);
        return modelAndView;
    }

    @PostMapping("/deleteExploitionEntity")
    public ModelAndView delete(@ModelAttribute("exploitionEntity") ExploitionEntity exploitionEntity) {
        ModelAndView modelAndView = new ModelAndView("");
        exploiEntityManager.removeExploition(exploitionEntity.getId());
        modelAndView.addObject("message", "success");
        return modelAndView;
    }

    @GetMapping("/viewExploitionEntity/{id}")
    public ModelAndView show(@PathVariable String id) {
        Optional<ExploitionEntity> exploitionEntity = exploiEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("exploitionEntity", exploitionEntity);

        return modelAndView;
    }
}
