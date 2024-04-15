package quizes.q3.giorgi_kitiashvili_2.language;

import java.util.HashMap;
import java.util.Map;

public class HotelManager {
    private Map<String, Room> occupiedRooms;

    public HotelManager() {
        occupiedRooms = new HashMap<>();
    }

    public void checkIn(String personId, Room room) {
        occupiedRooms.put(personId, room);
    }

    public void checkOut(String personId) {
        occupiedRooms.remove(personId);
    }

    public Room getRoomOfPerson(String personId) {
        return occupiedRooms.get(personId);
    }

    public void displayInfo() {
        for (Map.Entry<String, Room> entry : occupiedRooms.entrySet()) {
            String personId = entry.getKey();
            Room room = entry.getValue();
            System.out.println("Person ID: " + personId + ", Room: " + room.toString());
        }
    }
}