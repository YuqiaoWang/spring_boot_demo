package bupt.edu.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlController {
    @RequestMapping("/html/{name}")
    public String html(@PathVariable("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}