import java.util.List;

public class Hotel {
    private String name;
    private String location;
    private List<Room> rooms;
    private List<Reservation> reservations;

    public Hotel(String name, String location, List<Room> rooms, List<Reservation> reservations) {
        this.name = name;
        this.location = location;
        this.rooms = rooms;
        this.reservations = reservations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
