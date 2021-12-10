package remote.rest.DTO.request;

import java.util.List;

public class ReservationDTO {
    private List<HotelDTO> hotels;
    private PersonDTO person;


    public ReservationDTO() {
    }

    public ReservationDTO(List<HotelDTO> hotels, PersonDTO person) {
            this.hotels = hotels;
            this.person = person;
    }

    public List<HotelDTO> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelDTO> hotels) {
        this.hotels = hotels;
    }

    public PersonDTO getPerson() {
        return person;
    }

    public void setPerson(PersonDTO person) {
        this.person = person;
    }
}


