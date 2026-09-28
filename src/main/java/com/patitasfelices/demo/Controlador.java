package com.patitasfelices.demo;

import java.util.List;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.patitasfelices.demo.model.Mascota;
import com.patitasfelices.demo.service.MascotaService;

@Controller
public class Controlador {
    private final MascotaService mascotaService;

    Controlador(MascotaService mascotaService) {
        this.mascotaService = mascotaService;
    }

    @GetMapping("/")
    public String inicio() {
        return "index";
    }

    @GetMapping("/mascotas")
    public String listarMascotas(Model model) {
        List<Mascota> listaMascotas = mascotaService.obtenerTodasLasMascotas(); 
        model.addAttribute("mascotas", listaMascotas);
        return "mascotas"; 
    }

    @GetMapping("/adoptar")
    public String adoptar() {
        return "adoptar";
    } 

    @GetMapping("/contacto")
    public String contacto() {
        return "contacto";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    // para el login de usuarios normales y administradores
    @PostMapping("/procesar-login")
    public String procesarLogin(@RequestParam String email, @RequestParam String password, Model model, HttpSession session) {
        
        // cuenta Administrador
        if (email.equals("admin@patitas.com") && password.equals("123456")) {
            return "redirect:/admin";
        } 
        //Usuarios Normales
        else {
            session.setAttribute("usuario", email);
            return "redirect:/";

        }
    }

    // para cerrar cesion
    @GetMapping("/logout")
    public String cerrarSesion(HttpSession session) {
        session.invalidate(); //borra la memoria de la sesión
        return "redirect:/";
    }


}

