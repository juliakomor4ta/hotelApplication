package remote.rest.DTO.response;

import java.util.List;

public class HotelsCollectionDTO {
    private List<HotelDTOres> hotels;

    public HotelsCollectionDTO() {
    }

    public HotelsCollectionDTO(List<HotelDTOres> hotels) {
        this.hotels = hotels;
    }

    public List<HotelDTOres> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelDTOres> hotels) {
        this.hotels = hotels;
    }
}
