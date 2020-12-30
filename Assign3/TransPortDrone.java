//package com.company;

public class TransPortDrone extends Drone{
    private int heightCargo;
    private int widthCargo;

    public int getHeightCargo() {
        return heightCargo;
    }

    public void setHeightCargo(int heightCargo) {
        this.heightCargo = heightCargo;
    }

    public int getWidthCargo() {
        return widthCargo;
    }

    public void setWidthCargo(int widthCargo) {
        this.widthCargo = widthCargo;
    }

    public int getLengthCargo() {
        return lengthCargo;
    }

    public void setLengthCargo(int lengthCargo) {
        this.lengthCargo = lengthCargo;
    }

    private int lengthCargo;

    public TransPortDrone(String droneName, String droneId, double curPosX, double curPosY, double speed, double heading) {
        super(droneName, droneId, curPosX, curPosY, speed, heading);
    }

    public int cargoArea(int width, int length,int heightCargo)
    {
         return width*length*heightCargo;
    }
    public void print()
    {
      super.print();
      System.out.println("\n Area of the Cargo \n");
      System.out.println(cargoArea(getWidthCargo(),getLengthCargo(),getHeightCargo()));

    }
}
