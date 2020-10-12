public class RoomRunner {

    public static void main(String[] args) {
        Room room = new Room("Coffee", 4, 2,
                new TV("7series", "Samsung", 2020, 43),
                new Bed(2, "Cushion2T", "Sleepwell", 30));

        /*
            room --> bed object using getBed Method(getter)
            and sleepTime is method inside the Bed class
         */
        room.getTv().turnOffTV();
        room.getBed().sleepTime();

        /*
            without using getter and by using objects within objects
         */
        room.enterRoom();
    }
}
