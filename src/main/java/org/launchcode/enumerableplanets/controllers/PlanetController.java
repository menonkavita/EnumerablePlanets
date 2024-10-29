package org.launchcode.enumerableplanets.controllers;

import org.launchcode.enumerableplanets.data.Planets;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/")
@Controller
public class PlanetController {

    // Both the controllers and data packages need to within the enumerableplanets package
    // under org.launchcode for this to work


    @GetMapping()
    public String displayIndex(Model model) {
        model.addAttribute("planets", Planets.values());
        return "index";
    }

}
