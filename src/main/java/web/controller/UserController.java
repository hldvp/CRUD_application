package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;
import org.springframework.ui.Model;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String allUser(Model module){
        module.addAttribute("users",userService.getAllUsers());
        return "/users";
    }

//    @GetMapping("/{id}")
//    public String showById(@PathVariable("id") long id, Model model){
//        model.addAttribute("user", userService.getUserById(id));
//        return "/show";
//    }


    @GetMapping("/new")
    public String addNewUser(Model model){
        model.addAttribute("user", new User());
        return "/new";
    }

    @PostMapping("/new")
    public String createUser(@ModelAttribute("user") User user){
        userService.creatUser(user);
        return "redirect:/";
    }

    @GetMapping("/{id}/update")
    public String editUser(@PathVariable("id") long id, Model model){
        model.addAttribute("user", userService.getUserById(id));
        return "update";
    }

    @PatchMapping("/{id}")
    public String updateUser(@ModelAttribute("user") User user){
        userService.updateUser(user);
        return "redirect:/";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") long id){
        userService.deleteUser(id);
        return "redirect:/";
    }
}
