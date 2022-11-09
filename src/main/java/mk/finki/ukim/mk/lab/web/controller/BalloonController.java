package mk.finki.ukim.mk.lab.web.controller;

import mk.finki.ukim.mk.lab.service.impl.BalloonServiceImpl;
import mk.finki.ukim.mk.lab.service.impl.ManufacturerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BalloonController {
    private final BalloonServiceImpl balloonService;

    public BalloonController(BalloonServiceImpl balloonService) {
        this.balloonService = balloonService;
    }

    @GetMapping("/balloons")
    public String getBalloonsPage(@RequestParam(required = false) String error, Model model){
        model.addAttribute("balloons", balloonService.listAll());
        return "listBalloons.html";
    }
    @PostMapping("/balloons/add")
    public String saveBalloon(@RequestParam String name,
                              @RequestParam String description,
                              @RequestParam Long manufacturerId){

        return "redirect:/balloons";
    }
}
