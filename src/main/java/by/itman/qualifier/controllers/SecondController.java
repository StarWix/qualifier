package by.itman.qualifier.controllers;

import by.itman.qualifier.services.TheService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
    private final TheService secondService;

    public SecondController(final TheService secondService) {
        this.secondService = secondService;
    }

    @GetMapping("/second")
    public int getX() {
        return secondService.getX();
    }
}
