public class Room {

    private String color;
    private int walls;
    private int lights;
    private TV tv;
    public Bed bed;

    public Room(String color, int walls, int lights, TV tv, Bed bed) {
        this.color = color;
        this.walls = walls;
        this.lights = lights;
        this.tv = tv;
        this.bed = bed;
    }

    public String getColor() {
        return color;
    }

    public int getWalls() {
        return walls;
    }

    public int getLights() {
        return lights;
    }

    public TV getTv() {
        return tv;
    }

    public Bed getBed() {
        return bed;
    }

    private void goToSleep() {
        bed.sleepTime();
    }

    public void enterRoom() {
        tv.turnOffTV();
        goToSleep();
    }
}
