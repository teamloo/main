package controller;

import entity.DepartmentEntity;
import entity.ForestEntity;
import entity.OffenceEntity;
import entity.UnitEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.DepartmentEntityManager;
import service.ForestEntityManager;
import service.OffenceEntityManager;
import service.UnitEntityManager;

import java.util.Optional;

@Controller
public class DepartmentEntityController {

    @Autowired
    DepartmentEntityManager departmentEntityManager;

//    @Autowired
//    ForestEntityManager forestEntityManager;
//
//    @ModelAttribute("forestList")
//    Iterable<ForestEntity> forestList(Pageable pageable) {
//        return forestEntityManager.getAllForest(pageable);
//    }

    @Autowired
    UnitEntityManager unitEntityManager;

    @ModelAttribute("unitList")
    Iterable<UnitEntity> unitList(Pageable pageable) {
        return unitEntityManager.getAllUnit(pageable);
    }


    @RequestMapping(value = "/departmentEntity")
    public ModelAndView list(Pageable pageable) {
        Page<DepartmentEntity> list = departmentEntityManager.getAllDepartment(pageable);
        ModelAndView modelAndView = new ModelAndView("/department/list");
        modelAndView.addObject("list", list);
        return modelAndView;
    }


    @GetMapping("/departmentEntity/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/department/create");
        modelAndView.addObject("departmentEntity", new DepartmentEntity());
        return modelAndView;
    }


    @PostMapping("/departmentEntity/create")
    public ModelAndView create(@ModelAttribute("departmentEntity") DepartmentEntity departmentEntity) {
        departmentEntityManager.saveDepartment(departmentEntity);
        ModelAndView modelAndView = new ModelAndView("/department/create");
        modelAndView.addObject("departmentEntity", departmentEntity);

        return modelAndView;
    }


    @GetMapping("/departmentEntity/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Optional<DepartmentEntity> departmentEntity = departmentEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("/department/edit");
        modelAndView.addObject("departmentEntity", departmentEntity);
        return modelAndView;
    }


    @PostMapping("/departmentEntity/edit")
    public ModelAndView edit(@ModelAttribute("departmentEntity") DepartmentEntity departmentEntity) {
        departmentEntityManager.saveDepartment(departmentEntity);
        ModelAndView modelAndView = new ModelAndView("/department/edit");
        modelAndView.addObject("departmentEntity", departmentEntity);
        modelAndView.addObject("message", "Success");
        return modelAndView;
    }

    @GetMapping("/departmentEntity/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        Optional<DepartmentEntity> departmentEntity = departmentEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("/department/delete");
        modelAndView.addObject("departmentEntity", departmentEntity);
        return modelAndView;
    }

    @PostMapping("/departmentEntity/delete")
    public String delete(@ModelAttribute("departmentEntity") DepartmentEntity departmentEntity, Model model) {

        departmentEntityManager.removeDepartment(departmentEntity.getId());

        return "redirect:/departmentEntity";
    }

    @GetMapping("/departmentEntity/view/{id}")
    public ModelAndView show(@PathVariable Long id) {
        Optional<DepartmentEntity> departmentEntity = departmentEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("departmentEntity", departmentEntity);

        return modelAndView;
    }
}
