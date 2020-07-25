package week02.day01.MyHotel;

public class Hotel {
    Room[][] rooms = new Room[6][8];

    Hotel() {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                rooms[i][j] = new Room(i * 1000 + j + 1001);
            }
        }
    }

    void in(int roomNum, String name) {

    }

    void out(int roomNum) {

    }
}
