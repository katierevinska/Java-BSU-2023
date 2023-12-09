package by.katierevinska.docks_and_hobos;

import java.util.LinkedList;

public class Tunnel {
    private Long max_ships = 0L;
    private LinkedList<Ship> ships;

    Tunnel() {
        this.ships = new LinkedList<>();
    }

    private boolean isFull() {
        return ships.size() > max_ships;
    }

    int sizeOfShips() {
        return ships.size();
    }

    boolean isEmpty() {
        return ships.isEmpty();
    }

    public void setMaxShips(Long count) {
        max_ships = count;
    }

    public synchronized void setShip(Ship ship) {
        System.out.println("try set ship in tunnel");
        if (this.isFull()) {
              this.sinkShip();
        }
        ships.add(ship);
    }

    private void sinkShip() {
        System.out.println("sink lastIn ship");
    }

    public synchronized Ship sendToDock() throws InterruptedException {
        System.out.println("trying send to dock");
        if (this.isEmpty()) {
            wait();
        }
        System.out.println("send to dock");
        return ships.remove();
    }
}
