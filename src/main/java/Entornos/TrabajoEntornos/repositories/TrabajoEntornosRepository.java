package Entornos.TrabajoEntornos.repositories;



import Entornos.TrabajoEntornos.models.TrabajoEntornosModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrabajoEntornosRepository extends CrudRepository<TrabajoEntornosModel,Long>{

    
}
