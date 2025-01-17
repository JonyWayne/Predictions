package evgen.com.predictions.service.implementation;

import evgen.com.predictions.mapper.GreetingsMapper;
import evgen.com.predictions.model.dto.GreetingsDTO;
import evgen.com.predictions.model.entity.Greetings;
import evgen.com.predictions.repository.GreetingsRepository;
import evgen.com.predictions.service.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static evgen.com.predictions.utils.GetRandomValueUtils.getRandomId;

@Service
public class GreetingsServiceImpl implements GreetingsService {
    @Autowired
    private GreetingsRepository greetingsRepository;

    @Override
    public GreetingsDTO getGreetings() {
        // Получаем все ID приветствий
        List<Long> allIds = greetingsRepository.findAllIds();

        if (!allIds.isEmpty()) {
            // Выбираем случайный ID
            Long randomId = getRandomId(allIds);

            // Получаем объект по случайному ID
            Optional<Greetings> greetingsOptional = greetingsRepository.findById(randomId);

            if (greetingsOptional.isPresent()) {
                return GreetingsMapper.toDTO(greetingsOptional.get());
            }
        }

        return null; // или выбросьте исключение, если объект не найден
    }

}
