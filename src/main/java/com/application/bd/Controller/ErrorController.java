package com.application.bd.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ErrorController {

    @GetMapping("/error")
    public String handleError() {
        // Devuelve el nombre de la vista de error personalizada
        return "error";
    }

    // Maneja cualquier excepción no controlada y la redirige a la vista de error
    @ExceptionHandler(Throwable.class)
    public String handleException() {
        return "error";
    }
}

