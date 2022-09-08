package com.Van.EnigmaDT_V2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRest {

    @GetMapping("/")
    public String saludar(){
        return "Mama, estoy entendiendo Java";
    }

    @GetMapping("/about")
    public String presentar(){
        return "Hola soy van y estoy en mi segunda version de Java al anterior profe no le entendia nada";
    }
}
