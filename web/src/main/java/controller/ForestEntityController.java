package controller;

import entity.ForestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.ForestEntityManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Controller
public class ForestEntityController {

    @Autowired
    ForestEntityManager forestEntityManager;

    @ModelAttribute("functionList")
    List<String> functionList() {
        List<String> list = new ArrayList<String>();
        list.add("rừng phòng hộ");
        list.add("rừng sản xuất");
        list.add("rừng đặc dụng");
        return list;
    }

    @ModelAttribute("forestAge")
    List<String> forestAge() {
        List<String> list = new ArrayList<String>();
        list.add("rừng non");
        list.add("rừng xào");
        list.add("rừng trung niên");
        list.add("rừng già");
        return list;
    }

    @GetMapping("/forestEntity/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/forest/create");
        modelAndView.addObject("forestEntity",new ForestEntity());
        return modelAndView;
    }


    @PostMapping("/forestEntity/create")
    public ModelAndView create(@ModelAttribute("forestEntity") ForestEntity forestEntity) {
        forestEntityManager.saveForest(forestEntity);
        ModelAndView modelAndView = new ModelAndView("/forest/create");
        modelAndView.addObject("forestEntity", forestEntity);
        modelAndView.addObject("message","success");
        return modelAndView;
    }

    @GetMapping("/forestEntity")
    public ModelAndView list(Pageable pageable) {
        Page<ForestEntity> list = forestEntityManager.getAllForest(pageable);
        ModelAndView modelAndView = new ModelAndView("/forest/list");
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    @GetMapping("/forestEntity/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Optional<ForestEntity> forestEntity = forestEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("/forest/edit");
        modelAndView.addObject("forestEntity", forestEntity);
        return modelAndView;
    }


    @PostMapping("/forestEntity/edit")
    public ModelAndView edit(@ModelAttribute("forestEntity") ForestEntity forestEntity) {
        forestEntityManager.saveForest(forestEntity);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("forestEntity",forestEntity);
        modelAndView.addObject("message","Success");
        return modelAndView;
    }


    @ResponseBody
    @RequestMapping(value = "/forestEntity/delete")
    public Page<ForestEntity> ajaxDelete(HttpServletRequest req, HttpServletResponse res, Pageable pageable) {
        forestEntityManager.removeForest(Long.parseLong(req.getParameter("id")));
        Page<ForestEntity> forests = forestEntityManager.getAllForest(pageable);
        return forests;
    }

    @GetMapping("/forestEntity/view/{id}")
    public ModelAndView show(@PathVariable Long id) {
        Optional<ForestEntity> forestEntity = forestEntityManager.findById(id);
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("forestEntity", forestEntity);
        return modelAndView;
    }
}
