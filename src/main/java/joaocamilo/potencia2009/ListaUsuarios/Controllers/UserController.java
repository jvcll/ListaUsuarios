package joaocamilo.potencia2009.ListaUsuarios.Controllers;

import joaocamilo.potencia2009.ListaUsuarios.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
}

