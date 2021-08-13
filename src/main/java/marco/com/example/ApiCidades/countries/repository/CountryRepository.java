package marco.com.example.ApiCidades.countries.repository;

import marco.com.example.ApiCidades.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CountryRepository extends JpaRepository<Country,Long> {


}
