package evgen.com.predictions.model.dto.ai_api;

import evgen.com.predictions.model.entity.CardImage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AiRequestDTO {
    private String question;
    }
