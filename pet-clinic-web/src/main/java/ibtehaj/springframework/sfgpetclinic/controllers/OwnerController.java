package ibtehaj.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    @RequestMapping({"owners","owners/index", "owners-list","owners/index.html"})
    public String ownerIndex() {
        return "owner/index";
    }

}
