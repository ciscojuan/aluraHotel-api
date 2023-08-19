package alura.hotel.api.guest;

public record DatosGuest(
		Long id,
		String nombre,
		String apellido, 
		String documento,
		String telefono, 
		String email, 
		String birthday 
		) {
	public DatosGuest(Guest guest) {
		this(guest.getId(), guest.getNombre(), guest.getApellido(), guest.getDocumento(), guest.getTelefono(), guest.getEmail(), guest.getBirthday());
	}
}
