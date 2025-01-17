package evgen.com.predictions.utils;

import java.util.List;
import java.util.Random;

public class GetRandomValueUtils {
    public static Long getRandomId(List<Long> ids) {
        Random random = new Random();
        int randomIndex = random.nextInt(ids.size());
        return ids.get(randomIndex);
    }
}
