package carlos.oliveira.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import carlos.oliveira.models;


@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/inteiros")
    public String inteiros(Model model) {
        Inteiros int = new numeros inteiros(1 ate 30);
        model.addAttribute("resultado", inteiros.getResultados());
        return "inteiros";
    }
}
