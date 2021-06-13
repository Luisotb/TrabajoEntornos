package Entornos.TrabajoEntornos.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class GuardaBaseDatos {
          
    @RequestMapping("/insertaDatos")
        public String insercionDatos(){
            return "insercionDatos";
        }
    }