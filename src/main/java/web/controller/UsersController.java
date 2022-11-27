package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.models.User;
import web.service.UserService;

@Controller
@RequestMapping("/users")
public class UsersController {
    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()//"/count"
    public String countUsers(@RequestParam(name = "count", defaultValue = "10") int count, Model model) {
        model.addAttribute("listUsers", userService.countUsers(count));
        return "users";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model){
        model.addAttribute("user", userService.show(id));
        return "show";
    }

    @GetMapping("/new")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "new";
    }

    @PostMapping()
    public String create(@ModelAttribute("user") User user) {
        userService.save(user);
        return "redirect:/users";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id){
        model.addAttribute("user", userService.show(id));
        return "edit";
    }
//    {id}(id=${user.getId()}) {nomer}(nomer=${user.getNomer()}) {nameUs}(nameUs=${user.getNameUs()}) {lastNameUs}(lastNameUs=${user.getLastNameUs()}
    @PatchMapping("/{id}")
    public String update(@PathVariable("id") int id, @ModelAttribute("user") User user) {
        userService.update(id, user);
        return "redirect:/users";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id){
        userService.delete(id);
        return "redirect:/users";
    }

//    {nomer}{nameUs}{lastNameUs}
//    @PathVariable("nomer") int nomer,
//    @PathVariable("nameUs") String nameUs,
//    @PathVariable("lastNameUs") String lastNameUs


}
//    @PostMapping()
//    public String create (@RequestParam("gosNomer") String gosNomer,
//                          @RequestParam("brand") String brand,
//                          @RequestParam("color") String color){
//        Car car = new Car();
//        car.setGosNomer(gosNomer);
//        car.setBrand(brand);
//        car.setColor(color);
//        carService.save(car);
//
//        return "redirect:/cars";
//    }



