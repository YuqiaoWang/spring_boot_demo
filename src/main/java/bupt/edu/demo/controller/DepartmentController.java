package bupt.edu.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/dep")
@RestController
public class DepartmentController {
    @RequestMapping("/name")
    public String getDepName() {
        return "Dep name.";
    }
}