package academia.SpringBoaForma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController {

    @GetMapping("/loginBoaForma")
    public String paginaLogin() {
        return "acessos/loginBoaForma";
    }
}
