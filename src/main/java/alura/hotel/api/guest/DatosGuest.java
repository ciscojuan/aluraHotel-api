package alura.hotel.api.guest;

import alura.hotel.api.booking.DatosRegistroBooking;

public record DatosGuest(
		String nombre,
		String apellido, 
		String documento,
		String telefono, 
		String email, 
		String birthday 
		) {
	public DatosGuest(Guest guest) {
		this(guest.getNombre(), guest.getApellido(), guest.getDocumento(), guest.getTelefono(), guest.getEmail(), guest.getBirthday());
	}
}
