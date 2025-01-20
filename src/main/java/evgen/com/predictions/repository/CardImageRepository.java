package evgen.com.predictions.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import evgen.com.predictions.model.entity.CardImage;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardImageRepository extends JpaRepository<CardImage, Long> {
    @Query("SELECT c.id FROM CardImage c")
    List<Long> findAllIds();
}
