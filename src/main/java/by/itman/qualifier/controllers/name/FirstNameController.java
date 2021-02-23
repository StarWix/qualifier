package by.itman.qualifier.controllers.name;

import by.itman.qualifier.services.TheService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class FirstNameController {
    private final TheService firstService;

    public FirstNameController(final TheService firstService) {
        this.firstService = firstService;
    }

    @GetMapping("/first")
    public int getX() {
        return firstService.getX();
    }
}
