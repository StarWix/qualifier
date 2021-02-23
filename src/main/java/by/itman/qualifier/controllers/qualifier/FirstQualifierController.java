package by.itman.qualifier.controllers.qualifier;

import by.itman.qualifier.services.TheService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qualifier")
public class FirstQualifierController {
    private final TheService theService;

    public FirstQualifierController(@Qualifier("firstService") final TheService theService) {
        this.theService = theService;
    }

    @GetMapping("/first")
    public int getX() {
        return theService.getX();
    }
}
