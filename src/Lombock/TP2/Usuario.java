package Lombock.TP2;

import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class Usuario {
    private long id;
    private String nombre;
    private String email;
}
