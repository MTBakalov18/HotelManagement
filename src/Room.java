public class Room {
    private int roomNumber;
    private RoomType type;
    private String status;
    private double rate;

    public Room(int roomNumber, RoomType type, String status, double rate) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.status = status;
        this.rate = rate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
