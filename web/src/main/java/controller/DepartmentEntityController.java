package controller;

import entity.DepartmentEntity;
import entity.UnitEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.DepartmentEntityManager;
import service.UnitEntityManager;

import java.util.Optional;

@Controller
public class DepartmentEntityController {

    @Autowired
    DepartmentEntityManager departmentEntityManager;
    @Autowired
    UnitEntityManager unitEntityManager;

    @ModelAttribute("unitList")
    Iterable<UnitEntity> unitList(Pageable pageable) {
        return unitEntityManager.getAllUnit(pageable);
    }

    @GetMapping("/departmentEntity/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/department/create");
        modelAndView.addObject("departmentEntity", new DepartmentEntity());
        return modelAndView;
    }


    @PostMapping("/departmentEntity/create")
    public ModelAndView create(@ModelAttribute("edepartmentEntity") DepartmentEntity departmentEntity) {
        departmentEntityManager.saveDepartment(departmentEntity);
        ModelAndView modelAndView = new ModelAndView("/department/create");
        modelAndView.addObject("department", departmentEntity);
        modelAndView.addObject("message", "success");
        return modelAndView;
    }

    @RequestMapping(value = "/departmentEntity")
    public ModelAndView list(Pageable pageable) {
        Page<DepartmentEntity> list = departmentEntityManager.getAllDepartment(pageable);
        ModelAndView modelAndView = new ModelAndView("/department/list");
        modelAndView.addObject("list", list);
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
        modelAndView.addObject("department", departmentEntity);
        modelAndView.addObject("message", "Success");
        return modelAndView;
    }


}





















