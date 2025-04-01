package com.example.demo.controller;

import com.example.demo.model.Actor;
import com.example.demo.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DemoController {

    private ActorService actorService;

    @Autowired
    public DemoController(ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping("/prueba")
    public String prueba(Model model) {
        return "prueba";
    }



    @GetMapping("/")
    public String demo(Model model) {
            model.addAttribute("mensaje", "¡BIENVENIDO A LA PAGINA DE INICIO!");
        model.addAttribute("nombre","JORGE");

        return "hola";  // Devuelve el nombre de la vista (home.html o home.jsp)
    }

    @GetMapping("/actores")

    public String actores(Model model) {
        List<Actor> actores = actorService.findAll();
        model.addAttribute("actores", actores);
        return "actores";
    }
}
