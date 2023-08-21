package alura.hotel.api.guest;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarGuest (
    @NotNull Long  id,
    String nombre,
    String apellido,
    String telefono,
    String email,
    String birthday

) {

}
