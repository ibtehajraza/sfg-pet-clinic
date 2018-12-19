package ibtehaj.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets","/vets/list","/vets/index","/vets/index.html"})

    public String vetIndex(){
        return "vets/vets-index";
    }

}
