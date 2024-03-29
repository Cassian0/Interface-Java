package br.com.Interface.model;

public class Car extends Vehicle {

    private String doorNumber;

    public Car() {
        type = "Car";
    }

    public Car(Integer id, String doorNumber, String model, String brand, String renavam, String plate, double value) {
        super(id, "Car", model, brand, renavam, plate, value);
        this.doorNumber = doorNumber;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

}
