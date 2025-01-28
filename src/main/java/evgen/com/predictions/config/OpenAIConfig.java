package evgen.com.predictions.config;

import dev.langchain4j.model.openai.OpenAiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static evgen.com.predictions.constants.ApiAiConstants.API_KEY;

@Configuration
public class OpenAIConfig {

    @Bean
    public OpenAiChatModel openAiChatModel() {
        return OpenAiChatModel.builder()
                .apiKey(API_KEY)
                .modelName("gpt-4o-mini")
                .build();
    }
}
