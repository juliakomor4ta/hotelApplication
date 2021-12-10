package remote.rest.DTO.response;

import java.util.List;

public class HotelDTOres {
    private Integer id;
    private String name;
    private List<RoomDTO> rooms;

    public HotelDTOres(){
    }

    public HotelDTOres(Integer id, String name, List<RoomDTO> rooms) {
        this.id = id;
        this.name = name;
        this.rooms = rooms;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RoomDTO> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomDTO> rooms) {
        this.rooms = rooms;
    }
}
