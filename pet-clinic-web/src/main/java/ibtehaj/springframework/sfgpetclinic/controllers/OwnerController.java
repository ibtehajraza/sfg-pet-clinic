package ibtehaj.springframework.sfgpetclinic.controllers;

import ibtehaj.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/list", "/index.html"})
    public String ownerIndex(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owner/index";
    }

}
