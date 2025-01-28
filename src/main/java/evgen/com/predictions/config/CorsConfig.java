package evgen.com.predictions.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Разрешить CORS для всех эндпоинтов
                .allowedOrigins("http://localhost:5172") // Разрешить запросы с этого origin
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Разрешенные HTTP-методы
                .allowedHeaders("*") // Разрешить все заголовки
                .allowCredentials(true); // Разрешить передачу куки и авторизационных данных
    }
}
