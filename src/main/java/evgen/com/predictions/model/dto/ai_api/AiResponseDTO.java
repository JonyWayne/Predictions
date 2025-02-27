package evgen.com.predictions.model.dto.ai_api;

import evgen.com.predictions.model.entity.CardImage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AiResponseDTO {
    private String prediction;
    private List<CardImage> cards;
}
