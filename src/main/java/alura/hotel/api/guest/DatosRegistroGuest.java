package alura.hotel.api.guest;

import alura.hotel.api.booking.Booking;
import alura.hotel.api.booking.DatosRegistroBooking;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DatosRegistroGuest(
		@NotBlank String nombre,
		@NotBlank String apellido,
		@NotBlank @Pattern(regexp="\\d{4,6}") String documento,
		@NotBlank String telefono,
		@NotBlank @Email String email,
		@NotBlank String birthday,
		@NotNull @Valid	DatosRegistroBooking reserva
		) {

}
