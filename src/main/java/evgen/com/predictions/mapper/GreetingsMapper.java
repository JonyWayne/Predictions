package evgen.com.predictions.mapper;

import evgen.com.predictions.model.dto.GreetingsDTO;
import evgen.com.predictions.model.entity.Greetings;

public class GreetingsMapper {
    public static GreetingsDTO toDTO(Greetings entity) {
        GreetingsDTO dto = new GreetingsDTO();
        dto.setId(entity.getId());
        dto.setGreetingsTitle(entity.getGreetingsTitle());
        return dto;
    }

    public static Greetings toEntity(GreetingsDTO dto) {
        Greetings entity = new Greetings();
        entity.setId(dto.getId());
        entity.setGreetingsTitle(dto.getGreetingsTitle());
        return entity;
    }
}
