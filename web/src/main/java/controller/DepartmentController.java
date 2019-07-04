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

<<<<<<< HEAD
    @GetMapping("/departmentEntity")
    public ModelAndView list(Pageable pageable){
=======
    @GetMapping("/department")
    public ModelAndView list(Pageable pageable) {
>>>>>>> 3ac452d6e47fd633f8829f425bb0d24fbe03a833
        Page<DepartmentEntity> list = departmentEntityManager.getAllDepartment(pageable);
        ModelAndView mav = new ModelAndView("/department/index");
        mav.addObject("list", list);
        return mav;
    }
}
