package academia.SpringBoaForma.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class principalAdmController {

    @GetMapping("/homeADM")
    public String paginaPrincipalADM() {
        return "gestor/homeADM";
    }
}
