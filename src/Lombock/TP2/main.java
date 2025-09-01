package Lombock.TP2;

public class main {
    public static void main(String[] args) {
        Usuario usuario = Usuario.builder()
                .id(12345689)
                .nombre("Juan Perez")
                .email("juanperez123@gmail.com").build();

        System.out.println(usuario);
    }
}
