package evgen.com.predictions.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GetRandomValueUtils {
    public static Long getRandomId(List<Long> ids) {
        Random random = new Random();
        int randomIndex = random.nextInt(ids.size());
        return ids.get(randomIndex);
    }
    public static List<Long> getRandomId(List<Long> ids, int count) {
        if (count <= 0) {
            throw new IllegalArgumentException("Count must be greater than 0");
        }
        if (count > ids.size()) {
            throw new IllegalArgumentException("Count cannot be greater than the size of the list");
        }

        Random random = new Random();
        List<Long> randomIds = new ArrayList<>();
        List<Long> copyOfIds = new ArrayList<>(ids); // Создаем копию списка, чтобы не изменять оригинальный

        for (int i = 0; i < count; i++) {
            int randomIndex = random.nextInt(copyOfIds.size());
            randomIds.add(copyOfIds.get(randomIndex));
            copyOfIds.remove(randomIndex); // Удаляем выбранный элемент, чтобы избежать повторений
        }

        return randomIds;
    }
}


