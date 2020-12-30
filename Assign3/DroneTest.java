//package com.company;


import com.sun.tools.javac.util.List;

import java.util.ArrayList;

public class DroneTest {

    public void run()
    {
        // write your code here

        Drone d1 = new Drone("drone1","d11", 0, 0, 2, 30);
//    Drone1 d=new Drone1();
        Drone d2 = new Drone("drone2", "d12",1, 2, 2, 60);

        Drone d3 = new Drone("drone3", "d13",1, 2, 1, 150);

        Drone d4 = new Drone("drone4", "d14",1, 2, 9, 90);

        Drone d5 = new Drone("drone5", "d15",1, 1, 1, 0);
       //setting the destination
        d1.moveToDestination(3,4);
        d2.moveToDestination(7,8);
        d3.moveToDestination(7,9);
        d4.moveToDestination(11,14);
        d5.moveToDestination(13,4);
        int t2 = 10;
        d1.update(10);
        d2.update(t2);
        d3.update(10);
        d4.update(10);
        d5.update(15);
       // d3.update(10);
        d1.setBattery(100);
        System.out.println("Printing battery details for plane1 at t=2 sec");
        System.out.println(d1.getBattery(2)+" %");
        DroneScheduler DS=new DroneScheduler();
        DroneTask DT1=new DroneTask("ID1","TASK1","FLY","04/10/2020","9:30");
        DroneTask DT2=new DroneTask("ID2","TASK2","FLY","09/10/2020","15:30");
        DT1.setDroneId(d1.getDroneId());
        DT2.setDroneId(d2.getDroneId());
        DS.addArr(DT1);
        DS.addArr(DT2);
        DS.printArrayList();
        ArrayList<Drone> dList = new ArrayList<Drone>();
        dList.add(d1);
        dList.add(d2);
        dList.add(d3);

        TransPortDrone T=new TransPortDrone("TransPortdrone1","TD11", 0, 0, 2, 30,3,5,6);
        T.setHeightCargo(3);
        T.setLengthCargo(5);
        T.setWidthCargo(6);
        T.print();
        dList.add(T);
        DroneIO dIO=new DroneIO();
        dIO.save(dList,"resultfile.txt");
      /*  Drone a = null;
        TransPortDrone b=null;
        ArrayList<Drone> dList2 = null;
        dList2.add(a);
        dList2.add(b);*/
       // dIO.load(dList2,"resultfile.txt");

       /* Drone d2 = new Drone() {

        }


        Drone d3 = new Drone();

        Drone d4 = new Drone();

        Drone d5 new Drone();*/
    }
    public static void main(String[] args) {
        // write your code here
        DroneTest Dt=new DroneTest();
        Dt.run();
    }
}
