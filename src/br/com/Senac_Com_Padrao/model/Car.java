package br.com.Senac_Com_Padrao.model;

public class Car extends Vehicle {

    private String doorNumber;

    public Car() {
        type = "Car";
    }

    public Car(String doorNumber, Integer id, String model, String brand, String plate, double value, double ipva) {
        super(id, "Car", model, brand, plate, value, ipva);
        this.doorNumber = doorNumber;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

}
