package evgen.com.predictions.rest.controller;

import evgen.com.predictions.model.dto.ai_api.AiResponseDTO;
import evgen.com.predictions.service.CardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cards")
public class CardsController {
    @Autowired
    private CardsService cardsService;

    // Возвращаем ответ с картами и прогнозом от ИИ
    @GetMapping("")
    public AiResponseDTO showTripletCards() {
        return cardsService.getTripletCards();
    }
}
