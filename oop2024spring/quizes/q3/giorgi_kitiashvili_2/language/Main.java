package quizes.q3.giorgi_kitiashvili_2.language;

import quizes.q3.giorgi_kitiashvili_2.Person;
import quizes.q3.giorgi_kitiashvili_2.PersonManager;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotelManager hotelManager = new HotelManager();

        // Create a Person object with your name and surname
        Person you = new Person();
        you.setId("0Giorgi1");
        you.setName("Giorgi");
        you.setSurname("Kitiashvili");

        // Get the list of persons
        List<Person> persons = PersonManager.getPersons();

        // Check if there are any persons in the list
        if (!persons.isEmpty()) {
            // Get the first person from the list
            Person otherPerson = persons.get(0);

            // Create a Room object
            Room room = new Room();
            room.setRoomNumber("101");
            room.setRoomType("Single");

            // Check-in you and the other person into the same room
            hotelManager.checkIn(you.getId(), room);
            hotelManager.checkIn(otherPerson.getId(), room);

            // Print the hotel guests and room information
            hotelManager.displayInfo();
        }
    }
}