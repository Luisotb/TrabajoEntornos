package Entornos.TrabajoEntornos.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class TransformarFrase {
    public static String traductorAscii (@PathVariable String texto) {
    String ascii = "";
    for (int i = 0; i < texto.length(); i++) {
      ascii += "<br>" + (int) texto.charAt(i)  +texto.charAt(i);
    }
    return  ascii;
  }
 
}
