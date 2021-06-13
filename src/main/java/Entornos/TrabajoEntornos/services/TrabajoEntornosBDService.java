package Entornos.TrabajoEntornos.services;

import java.util.ArrayList;
import Entornos.TrabajoEntornos.models.TrabajoEntornosModel;
import Entornos.TrabajoEntornos.repositories.TrabajoEntornosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrabajoEntornosBDService {

    @Autowired
    static

    TrabajoEntornosRepository entornosRepository;


    public TrabajoEntornosModel guardarDatos(TrabajoEntornosModel modeloDatos){
        return entornosRepository.save(modeloDatos);
    }

    public ArrayList<TrabajoEntornosModel> devuelveDatos(){
        return(ArrayList<TrabajoEntornosModel>) entornosRepository.findAll();
    }
}
