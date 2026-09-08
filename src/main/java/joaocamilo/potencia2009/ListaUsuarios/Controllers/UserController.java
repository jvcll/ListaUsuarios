package joaocamilo.potencia2009.ListaUsuarios.Controllers;

import joaocamilo.potencia2009.ListaUsuarios.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    private List<User> listUser = new ArrayList<User>();
    @GetMapping("/index")
    public String index(ModelMap model){
        listUser.clear();
        listUser.add(new User(1L, "Camilo", "@potencia2009", 119));
        model.addAttribute("users", listUser);
        model.addAttribute("size", listUser.size());
        return "users/index";
    }
    @GetMapping("new")
    public String userNew(ModelMap model){
        model.addAttribute("user", new User());
        return "users/new";
    }
}

