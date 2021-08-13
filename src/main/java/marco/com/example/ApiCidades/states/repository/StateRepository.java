package marco.com.example.ApiCidades.states.repository;

import marco.com.example.ApiCidades.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StateRepository extends JpaRepository<State, Long> {
}