package alura.hotel.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alura.hotel.api.guest.DatosGuest;
import alura.hotel.api.guest.DatosRegistroGuest;
import alura.hotel.api.guest.Guest;
import alura.hotel.api.guest.GuestRepository;

@RestController
@RequestMapping("/guest")
public class GuestController {
	
	@Autowired
	private GuestRepository guestRepository;
	

	@GetMapping
	public Page<DatosGuest> getGuests(@PageableDefault(size = 2) Pageable paginacion) {
		return guestRepository.findAll(paginacion).map(DatosGuest::new);
	}
	
	@PostMapping
	public void register(@RequestBody DatosRegistroGuest datosRegistroGuest) {
		guestRepository.save(new Guest(datosRegistroGuest));
	    
	}
}
