package evgen.com.predictions.loaders;

import evgen.com.predictions.model.entity.Greetings;
import evgen.com.predictions.model.entity.CardImage;
import evgen.com.predictions.repository.GreetingsRepository;
import evgen.com.predictions.repository.CardImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static evgen.com.predictions.constants.InitialConstants.*;


@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private GreetingsRepository greetingsRepository;

    @Autowired
    private CardImageRepository cardImageRepository;

    @Override
    public void run(String... args) throws Exception {
//        loadGreetings();
        loadCardImages();
        loadGreetings();
    }

    private void loadGreetings() {
        if (greetingsRepository.count() == 0) {
            List<Greetings> greetings = new ArrayList<>();
            for (String text : GREETINGS_TEXT) {
                greetings.add(new Greetings(null, text));
            }
            greetingsRepository.saveAll(greetings);
        }
    }

    private void loadCardImages() throws IOException {
        if (cardImageRepository.count() == 0) {
            String imagePath = "static/images/taro_cards/";


            for (int i = 0; i < IMG_NAMES.length; i++) {
                byte[] imageData = Files.readAllBytes(
                        Paths.get(new ClassPathResource(imagePath + IMG_NAMES[i]).getURI())
                );
                CardImage cardImage = new CardImage();
                cardImage.setImageData(imageData);
                cardImage.setImageName(CARD_NAMES[i]); // Используем имя карты из массива
                cardImage.setUploadTime(new Timestamp(System.currentTimeMillis()));
                cardImageRepository.save(cardImage);
            }
        }
    }
}
