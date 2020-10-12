public class Bed {

    private int bedFrames;
    private String model;
    private String manufacturer;
    private int size;

    public Bed(int bedFrames, String model, String manufacturer, int size) {
        this.bedFrames = bedFrames;
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
    }

    public int getBedFrames() {
        return bedFrames;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public void sleepTime() {
        System.out.println("The time is 11 PM - 8 AM so go to sleep");
    }
}
