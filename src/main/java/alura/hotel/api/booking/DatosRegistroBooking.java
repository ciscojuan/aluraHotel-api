package alura.hotel.api.booking;


import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroBooking(
		@NotBlank
		String entrada,
		@NotBlank
		String salida,
		@NotBlank
		String valor,
		@NotNull
		@Enumerated(EnumType.STRING)
		Pago payment
		) {

}
