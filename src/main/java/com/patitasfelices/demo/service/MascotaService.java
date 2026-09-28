package com.patitasfelices.demo.service;

import com.patitasfelices.demo.model.Mascota;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class MascotaService {

    public List<Mascota> obtenerTodasLasMascotas() {
        return Arrays.asList(
            new Mascota(1L, "Mango", "Golden Retriever", "8 meses", "Macho", "Grande", "Juguetón", "Mango adora correr en el parque y es muy cariñoso con los niños. Está vacunado y desparasitado.", "/Img/perrito1.jpg"),
            new Mascota(2L, "Luna", "Mestiza", "1 año y medio", "Hembra", "Mediano", "Tranquila", "Luna es muy obediente, le encanta pasear de forma calmada y se lleva excelente con otros animales en casa.", "/Img/perro3.jpg"),
            new Mascota(3L, "Rocky", "Pastor Alemán", "2 años", "Macho", "Grande", "Protector", "Rocky es un perro muy leal, inteligente y activo. Ideal para hogares con espacio amplio.", "/Img/perro4.jpg"),
            new Mascota(4L, "Mila", "Siamés Mix", "6 meses", "Hembra", "Pequeño", "Curiosa", "Mila es muy juguetona y le encanta dormir en lugares cálidos. Está esterilizada y lista para encontrar un hogar amoroso.", "/Img/gato1.jpg"),
            new Mascota(5L, "Toby", "Cocker Spaniel", "1 año", "Macho", "Mediano", "Amigable", "Toby es sumamente alegre, le fascina jugar con la pelota y convive muy bien con otros perros. Vacunado al día.", "/Img/perro5.jpg"),
            new Mascota(6L, "Cleo", "Angora Mix", "2 años", "Hembra", "Pequeño", "Tranquila", "Cleo es muy independiente, elegante y de mirada tierna. Disfruta de los ambientes calmados y los espacios acogedores.", "/Img/gato2.jpg"),
            new Mascota(7L, "Bruno", "Beagle Mix", "4 meses", "Macho", "Mediano", "Juguetón", "Bruno es un cachorro lleno de energía, muy curioso y con muchas ganas de aprender. Vacunado con su primera dosis.", "/Img/perro9.jpg"),
            new Mascota(8L, "Simón", "Schnauzer Mix", "3 años", "Macho", "Mediano", "Cariñoso", "Simón es un perrito tranquilo, muy noble y de excelente compañía para adultos mayores o departamentos. Desparasitado y con todas sus vacunas.", "/Img/perro8.jpg"),
            new Mascota(9L, "Lola", "Labrador Mix", "2 años", "Hembra", "Grande", "Dulce", "Lola es una perrita sumamente dulce, le encanta recibir mimos y se adapta con mucha facilidad a cualquier hogar. Totalmente sana y vacunada.", "/Img/perrito3.jpg")
        );
    }
}

