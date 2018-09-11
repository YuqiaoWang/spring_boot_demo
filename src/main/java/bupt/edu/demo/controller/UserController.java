package bupt.edu.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bupt.edu.demo.domain.User;

@RequestMapping("/user")
@RestController
public class UserController {
    @RequestMapping("/{id}")
    public User getByUserId(@PathVariable String id) {
        User u = new User();
        u.setId(new Integer(id));
        u.setName("name=" + id);
        return u;
    }
}