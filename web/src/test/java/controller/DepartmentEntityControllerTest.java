package controller;

import entity.DepartmentEntity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.ModelAndView;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class DepartmentEntityControllerTest {
    private MockMvc mockMvc;

    @InjectMocks
    private DepartmentEntityController departmentEntityController;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(departmentEntityController).build();
    }

    @Test
    public void testController() throws Exception {
        ModelAndView modelAndView = new ModelAndView("");
        modelAndView.addObject("departmentEntity",new DepartmentEntity());
        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}