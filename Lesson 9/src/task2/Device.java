package task2;

public class Device {
    public String manufacturer;
    public float price;
    public String serialNumber;

    Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String toString(){
        return "Device: manufacturer " + manufacturer + ". Price: " + price + ". SerialNumber: " + serialNumber;
    }
}


