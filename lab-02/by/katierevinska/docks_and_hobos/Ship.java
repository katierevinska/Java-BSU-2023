package by.katierevinska.docks_and_hobos;

public class Ship {
    private String cargoType;
    private Long shipCapacity;

    Long getShipCapacity() {
        return shipCapacity;
    }

    Ship(String cargoType, Long capacity) {
        this.cargoType = cargoType;
        this.shipCapacity = capacity;
    }
}
