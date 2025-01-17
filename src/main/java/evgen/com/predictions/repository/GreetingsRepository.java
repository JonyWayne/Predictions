package evgen.com.predictions.repository;

import evgen.com.predictions.model.entity.Greetings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GreetingsRepository extends JpaRepository<Greetings, Long> {

    @Query("SELECT g.id FROM Greetings g")
    List<Long> findAllIds();
}
