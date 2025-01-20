package evgen.com.predictions.service;

import evgen.com.predictions.model.dto.ai_api.AiResponseDTO;

public interface CardsService {
    //    Получить триплет расклад с прогнозом ИИ
    AiResponseDTO getTripletCards();

}
