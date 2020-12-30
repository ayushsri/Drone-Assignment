package com.company;

public class Drone {
    private String droneName;
    private String droneId;
    private double curPosX;
    private double curPosY;
    private double speed;
    private double heading;
    private double loadCapacity;
    private double battery;
    private double destX;
    private double destY;



    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public String getDroneId() {
        return droneId;
    }

    public void setDroneId(String droneId) {
        this.droneId = droneId;
    }

    public Drone(String droneName, String droneId, double curPosX, double curPosY, double speed, double heading)
    {   this.droneId=droneId;
        this.droneName=droneName;
        this.curPosX=curPosX;
        this.curPosY=curPosY;
        this.speed=speed;
        this.heading=heading;
    }
    public Drone()
    {
    }

    public void setDroneName(String droneName) {
        this.droneName = droneName;
    }

    public double getLoadCapacity() {
        return loadCapacity;

    }

    public double getBattery(double t) {
        //battery is decreasing with time t;
        return this.battery-(this.battery*0.0001*t);
    }

    public void setCurPosX(double curPosX) {
        this.curPosX = curPosX;
    }

    public void setCurPosY(double curPosY) {
        this.curPosY = curPosY;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setHeading(double heading) {
        this.heading = heading;
    }

    public String getDroneName() {
        return droneName;
    }

    public double getCurPosX() {
        return curPosX;
    }

    public double getCurPosY() {
        return curPosY;
    }

    public double getSpeed() {
        return speed;
    }

    public double getHeading() {
        return heading;
    }

    public void moveToDestination(double x, double y)
    {
      this.destX=x;
      this.destY=y;
    }

    public void update(int t){
        double x=this.curPosX,y=this.curPosY;
        //calculate angle at which plane will move.
       // System.out.println(this.droneName);
        //System.out.println(this.curPosX);
        //System.out.println(this.destX);
        //System.out.println( Math.atan((this.destY-y)/(this.destX-x)));
        double radians = Math.atan((this.destY-y)/(this.destX-x));
       // System.out.println(radians);
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        System.out.println("Boundry coverage for drone "+this.droneName+" is as follow");
        for(int i=1;(i<=t)&&(x<this.destX)&&(y<this.destY);i++)
        {
            x=speed*cosValue*i;
            y=speed*sinValue*i;
            if(x>=this.destX||y>=this.destY)
            {  System.out.println("Drone Reached to Destination at time "+i); break;}
            System.out.println("Distance moved after time t= "+i+" x position moved= " +x +" and y="+y);

        }
    }

    public void print()
    {
        System.out.println("\n Drone Information:");
        System.out.println("Name: "+this.getDroneName());
        System.out.println("Id :" +this.getDroneId());

    }

}
