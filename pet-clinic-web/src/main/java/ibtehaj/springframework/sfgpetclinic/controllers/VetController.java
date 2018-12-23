package ibtehaj.springframework.sfgpetclinic.controllers;

import ibtehaj.springframework.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {

    private final VetService vetService;

    @Autowired
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/", "", "/list", "/index", "/index.html"})
    public String vetIndex(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vet/index";
    }

}
