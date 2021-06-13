package Entornos.TrabajoEntornos.Controllers;

import Entornos.TrabajoEntornos.services.TraductorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TraductorController {
    
    @Autowired

    TraductorService traductorService;

    @RequestMapping("/traduce/{texto}")
    public String traduce(@PathVariable String frase, Model modelo){
        String translatedText= traductorService.getTraduccion(frase);
        modelo.addAttribute("frase", frase);
        modelo.addAttribute("translatedText", translatedText);
        return "Traduccion";
    }
}
