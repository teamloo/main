package controller;

import entity.DepartmentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import service.DepartmentEntityManager;


@Controller
public class DepartmentController {
    @Autowired
    DepartmentEntityManager departmentEntityManager;

    @GetMapping("/department")
    public ModelAndView list(Pageable pageable){
        Page<DepartmentEntity> list = departmentEntityManager.getAllDepartment(pageable);
        ModelAndView mav = new ModelAndView("/department/index");
        return mav;
    }
}
