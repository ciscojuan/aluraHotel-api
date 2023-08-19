package alura.hotel.api.guest;

import org.springframework.data.jpa.repository.JpaRepository;

import alura.hotel.api.controller.GuestController;

public interface GuestRepository extends JpaRepository<Guest, Long>{
	

}
