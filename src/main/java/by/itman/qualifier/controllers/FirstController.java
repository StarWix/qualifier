package by.itman.qualifier.controllers;

import by.itman.qualifier.services.TheService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    private final TheService firstService;

    public FirstController(final TheService firstService) {
        this.firstService = firstService;
    }

    @GetMapping("/first")
    public int getX() {
        return firstService.getX();
    }
}
