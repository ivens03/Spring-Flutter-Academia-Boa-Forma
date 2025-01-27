package academia.SpringBoaForma.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class loginController {

    @GetMapping("/login")
    public String paginaLogin() {
     return "acessos/loginBoaForma";
    }
}
