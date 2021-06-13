package Entornos.TrabajoEntornos.Controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Entornos.TrabajoEntornos.models.TrabajoEntornosModel;
import Entornos.TrabajoEntornos.services.ContarVocalesConsonantes;
import Entornos.TrabajoEntornos.services.TrabajoEntornosBDservice;
import Entornos.TrabajoEntornos.services.TransformarFrase;

@RestController

public class Funcionalidades {

    @Autowired
    ContarVocalesConsonantes contar;

    @GetMapping("/")
    public String explicacion() {
        return

        "Estas son todas las funciones que puedes realizar:" + "<br>" + "<br>" +

                "- Para contar las vocales y consonantes de una palabra, escribe: /contar/{palabra}" +

                "<br>" + "<br>" +

                "- Para guardar datos en la base de datos, escribe: '/insertaDatos'" +

                "<br>" + "<br>" +

                "- Para listar los datos de la base, escribe: '/listarDatos'" + "<br>" + "<br>" +

                "- Para mostrar una frase al reves, escribe: /traductorAscii/{texto} ";
    }

    @GetMapping("/contar/{palabra}")
    public String contarVocalesConsonantes(@PathVariable String palabra) {
        String resultado = ContarVocalesConsonantes.contarConsonantes(palabra);
        return resultado;

    }

    @GetMapping("(/contar1")
    public String contar1() {
        return "hola";
    }

    @Autowired
    TrabajoEntornosBDservice trabajoBDservice;

    @PostMapping("/insertaDatos")
    public String insertaDatos(@RequestParam Map<String, String> body) {
        System.out.println(body.get("dato"));
        TrabajoEntornosModel entornosModel = new TrabajoEntornosModel();
        entornosModel.setDato(body.get("dato"));
        trabajoBDservice.guardarDatos(entornosModel);
        return "Dato guardado correctamente.";

    }

    @GetMapping("/listarDatos")
    public String listarDatos() {
        return trabajoBDservice.devuelveDatos().toString();
    }

    @GetMapping("/traductorAscii/{texto}")
    public String traductorAscii(@PathVariable String texto) {
        String ascii = TransformarFrase.traductorAscii(texto);
        return "- La frase original es: " + texto +

                "<br>" + "<br>" +

                "- La frase en ascii es: " + ascii;
    }
}