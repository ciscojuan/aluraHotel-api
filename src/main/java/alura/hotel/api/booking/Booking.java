package alura.hotel.api.booking;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
	private String entrada;
	private String salida;
	private String valor;
	private @Enumerated(EnumType.STRING) Pago payment;

	public Booking(DatosRegistroBooking datosRegistroReserva) {
		this.entrada = datosRegistroReserva.entrada();
		this.salida = datosRegistroReserva.salida();
		this.valor = datosRegistroReserva.valor();
		this.payment = datosRegistroReserva.payment();
	}
}
