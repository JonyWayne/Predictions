package evgen.com.predictions.rest.controller;

import evgen.com.predictions.model.dto.GreetingsDTO;
import evgen.com.predictions.service.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {
    @Autowired
    private GreetingsService greetingsService;

    @GetMapping("")
    public GreetingsDTO showGreetingsTitle () {
        return greetingsService.getGreetings();
    }
}
