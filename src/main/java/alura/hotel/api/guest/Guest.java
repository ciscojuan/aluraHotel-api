package alura.hotel.api.guest;

import alura.hotel.api.booking.Booking;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="guests")
@Entity(name="Guest")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Guest {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	private String documento;
	private String telefono;
	private String email;
	private String birthday;
	@Embedded
	private Booking reserva;
	
	public Guest(DatosRegistroGuest datosRegistroGuest) {
		this.nombre = datosRegistroGuest.nombre();
		this.apellido = datosRegistroGuest.apellido();
		this.documento = datosRegistroGuest.documento();
		this.telefono = datosRegistroGuest.telefono();
		this.email = datosRegistroGuest.email();
		this.birthday = datosRegistroGuest.birthday();
		this.reserva = new Booking(datosRegistroGuest.reserva());
	}
}

