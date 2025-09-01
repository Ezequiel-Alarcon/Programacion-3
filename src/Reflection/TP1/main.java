package Reflection.TP1;

import java.lang.reflect.Constructor;
import java.lang.reflect.*;

public class main {
    public static void main(String[] args) throws Exception {

        // 1. Obtener la clase
        Class<?> clasePersona = Persona.class;

        // 2. Imprimir constructores
        Constructor<?>[] constructores = clasePersona.getDeclaredConstructors();
        for (Constructor<?> c : constructores) {
            System.out.println("Constructor: " + c);
        }

        // 3. Instanciar objeto usando Reflection
        Constructor<?> constructor = clasePersona.getConstructor(String.class, int.class);
        Object persona = constructor.newInstance("Juan", 25);

        // 4. Modificar atributo privado "nombre"
        Field campoNombre = clasePersona.getDeclaredField("nombre");
        campoNombre.setAccessible(true);
        campoNombre.set(persona, "Carlos");

        // 5. Invocar metodo mostrarInfo()
        Method metodoMostrar = clasePersona.getMethod("mostrarInfo");
        metodoMostrar.invoke(persona);

        // 6. Cambiar metodo Saludar a privado y acceder
        Method metodoSaludar = clasePersona.getDeclaredMethod("Saludar");
        metodoSaludar.setAccessible(true);
        String saludo = (String) metodoSaludar.invoke(persona);
        System.out.println("Saludo (via reflection): " + saludo);
    }
}

