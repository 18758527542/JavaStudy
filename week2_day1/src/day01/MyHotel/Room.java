package day01.MyHotel;

public class Room {
    private int roomNum;
    Guest guest;

    public Room(int roomNum) {
        this.roomNum = roomNum;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void seetRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }
}
