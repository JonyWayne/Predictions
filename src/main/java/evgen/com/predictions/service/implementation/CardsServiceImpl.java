package evgen.com.predictions.service.implementation;

import dev.langchain4j.model.openai.OpenAiChatModel;
import evgen.com.predictions.model.dto.ai_api.AiRequestDTO;
import evgen.com.predictions.model.dto.ai_api.AiResponseDTO;
import evgen.com.predictions.model.entity.CardImage;
import evgen.com.predictions.repository.CardImageRepository;
import evgen.com.predictions.service.CardsService;
import evgen.com.predictions.utils.GetRandomValueUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static evgen.com.predictions.constants.ApiAiConstants.ADDITIONAL_TEXT;
import static evgen.com.predictions.constants.ApiAiConstants.MAIN_QUESTION;

@Service
public class CardsServiceImpl implements CardsService {

    @Autowired
    private CardImageRepository cardImageRepository;
    @Autowired
    private RestTemplate restTemplate;
    private final OpenAiChatModel model;

    @Autowired
    public CardsServiceImpl(OpenAiChatModel model) {
        this.model = model;
    }

    @Value("${ai.api.url}")
    private String AiApiUrl; // URL API ИИ


    @Override
    public AiResponseDTO getTripletCards() {
        // Получаем три карты
        List<CardImage> tripletCards = getRandomTripletCards();
        String cardsNameToString = tripletCards.stream().map(CardImage::getImageName)
                .collect(Collectors.joining(", "));
        //        Формируем вопрос для запроса у ИИ
        String aiQuestion = MAIN_QUESTION + cardsNameToString + ADDITIONAL_TEXT;
        // Отправляем запрос к ИИ
//        String aiPrediction = getAIPrediction(aiQuestion);
        // Отправляем запрос к ИИ
        String answer = model.generate(aiQuestion);
        System.out.println(aiQuestion);
        // Создаем ответ
        AiResponseDTO response = new AiResponseDTO();
        response.setCards(tripletCards);
        response.setPrediction(answer);

        return response;
    }

    private List<CardImage> getRandomTripletCards() {
        // Получаем список id картинок
        List<Long> cardsImagesIds = cardImageRepository.findAllIds();
        if (!cardsImagesIds.isEmpty()) {
            // Выбираем триплет случайных картинок
            List<Long> randomIds = GetRandomValueUtils.getRandomId(cardsImagesIds, 3);
            // Получаем объекты по случайным ID
            return cardImageRepository.findAllById(randomIds);
        }
        return Collections.emptyList();
    }

    private String getAIPrediction(String question) {
        try {
            // Подготавливаем запрос к ИИ
            AiRequestDTO request = new AiRequestDTO();
            request.setQuestion(question);
            // Отправляем запрос к ИИ и получаем ответ
            AiResponseDTO aiResponse = restTemplate.postForObject(AiApiUrl, request, AiResponseDTO.class);
            return aiResponse != null ? aiResponse.getPrediction() : null;
        } catch (Exception e) {
            System.err.println("Ошибка при запросе к ИИ: " + e.getMessage());
            return null; // Возвращаем null, если запрос к ИИ не удался
        }
    }



}
