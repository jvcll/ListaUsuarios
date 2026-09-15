package joaocamilo.potencia2009.ListaUsuarios.Controllers;

import joaocamilo.potencia2009.ListaUsuarios.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    private List<User> listUser = new ArrayList<User>();
    @GetMapping("/index")
    public String index(ModelMap model){
        model.addAttribute("users", listUser);
        model.addAttribute("size", listUser.size());
        return "users/index";
    }
    @GetMapping("/new")
    public String userNew(ModelMap model){
        model.addAttribute("user", new User());
        return "users/new";
    }

    @PostMapping("/create")
    public String userCreate(@ModelAttribute User user, ModelMap model){
        System.out.println("######################################");
        System.out.println("Nome recebido: " + user.getName());
        System.out.println("######################################");
        long id = listUser.size()+1;
        listUser.add(new User(id, user.getName(), user.getArroba(), user.getCpf()));
        model.addAttribute("user", user);
        return "redirect:/user/index";
    }
    @GetMapping("/edit/{id}")
    public String editUser(@PathVariable Long id, ModelMap model){
        int idInt = Math.toIntExact((id-1L));
        User userEdit = listUser.get(idInt);
        model.addAttribute("user",  userEdit );
        return "users/edit";
    }

    @PostMapping("/update/{id}")
    public String userUpdate(@PathVariable Long id, @ModelAttribute User user, ModelMap model){
        int idInt = Math.toIntExact((id-1L));
        User userEdit = listUser.get(idInt);
        userEdit.setName(user.getName());
        userEdit.setArroba(user.getArroba());
        userEdit.setCpf(user.getCpf());
        model.addAttribute("user", user);
        return "redirect:/user/show";
    }

    @GetMapping("/show/{id}")
    public String showUser(@PathVariable Long id, ModelMap model){
        int idInt = Math.toIntExact((id-1L));
        User userShow = listUser.get(idInt);
        model.addAttribute("user", userShow);
        return "/users/show";
    }
    @PostMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id, ModelMap model){
        int idInt = Math.toIntExact(id - 1L);
        listUser.remove(idInt);
        return "redirect:/user/index";
    }
}

