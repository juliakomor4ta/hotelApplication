package remote.rest.DTO.response;

import remote.rest.DTO.request.HotelDTO;
import remote.rest.DTO.request.PersonDTO;

public class ReservationsDTO {
    private Integer id;
    private String status;
    private HotelDTO rooms;
    private PersonDTO person;

    public ReservationsDTO() {
    }

    public ReservationsDTO(Integer id, String status, HotelDTO rooms, PersonDTO person) {
        this.id = id;
        this.status = status;
        this.rooms = rooms;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HotelDTO getRooms() {
        return rooms;
    }

    public void setRooms(HotelDTO rooms) {
        this.rooms = rooms;
    }

    public PersonDTO getPerson() {
        return person;
    }

    public void setPerson(PersonDTO person) {
        this.person = person;
    }
}
