package controller;

import entity.DepartmentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.DepartmentEntityManager;

import java.util.Optional;

@Controller
public class DepartmentEntityController {

    @Autowired
    DepartmentEntityManager departmentEntityManager;


    @GetMapping("/departmentEntity/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("departmentEntity",new DepartmentEntity());
        return modelAndView;
    }


    @PostMapping("/departmentEntity/create")
    public ModelAndView create(@ModelAttribute("departmentEntity") DepartmentEntity departmentEntity) {
        departmentEntityManager.saveDepartment(departmentEntity);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("departmentEntity", departmentEntity);
        modelAndView.addObject("message","success");
        return modelAndView;
    }

    @RequestMapping(value = "/departmentEntity")
    public ModelAndView list(Pageable pageable) {
        Page<DepartmentEntity> list = departmentEntityManager.getAllDepartment(pageable);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    @GetMapping("/editDepartmentEntity/{id}")
    public ModelAndView showEditForm(@PathVariable String id) {
        Optional<DepartmentEntity> departmentEntity = departmentEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");

        modelAndView.addObject("departmentEntity", departmentEntity);
        return modelAndView;
    }


    @PostMapping("/editDepartmentEntity")
    public ModelAndView edit(@ModelAttribute("departmentEntity") DepartmentEntity departmentEntity) {
        departmentEntityManager.saveDepartment(departmentEntity);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("departmentEntity",departmentEntity);
        modelAndView.addObject("message","Success");
        return modelAndView;
    }

    @GetMapping("/deleteDepartmentEntity/{id}")
    public ModelAndView showDeleteForm(@PathVariable String id) {

        Optional<DepartmentEntity> departmentEntity = departmentEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("departmentEntity", departmentEntity);
        return modelAndView;
    }

    @PostMapping("/deleteDepartmentEntity")
    public ModelAndView delete(@ModelAttribute("departmentEntity") DepartmentEntity departmentEntity) {
        ModelAndView modelAndView = new ModelAndView("");
        departmentEntityManager.removeDepartment(departmentEntity.getId());
        modelAndView.addObject("message", "success");
        return modelAndView;
    }

    @GetMapping("/viewDepartmentEntity/{id}")
    public ModelAndView show(@PathVariable String id) {
        Optional<DepartmentEntity> departmentEntity = departmentEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("departmentEntity", departmentEntity);

        return modelAndView;
    }


}





















