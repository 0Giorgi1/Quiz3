package quizes.q3.giorgi_kitiashvili_2.language;

public class Room {
    private String roomNumber;
    private String roomType;

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "Room Number: " + roomNumber + ", Room Type: " + roomType;
    }
}