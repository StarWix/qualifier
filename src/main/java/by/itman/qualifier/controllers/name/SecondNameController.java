package by.itman.qualifier.controllers.name;

import by.itman.qualifier.services.TheService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class SecondNameController {
    private final TheService secondService;

    public SecondNameController(final TheService secondService) {
        this.secondService = secondService;
    }

    @GetMapping("/second")
    public int getX() {
        return secondService.getX();
    }
}
