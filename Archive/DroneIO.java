package com.company;


import com.sun.tools.javac.util.List;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DroneIO {

 /*   public DroneIO(String droneName, String droneId, double curPosX, double curPosY, double speed, double heading) {
        super(droneName, droneId, curPosX, curPosY, speed, heading);
    }
*/
    private void save(Drone D, String filename)
    {
        FileWriter f;
        try{ f=new FileWriter(filename,true);
           // String base="Users/ayushsrivastava/desktop";
            BufferedWriter writer=new BufferedWriter(f);
         //   System.out.println(base);
           // BufferedWriter writer=new BufferedWriter(f);

           // f.append("Drone Information ");
           // f.write(String.valueOf(D));
            System.out.println("Drone Name " +D.getDroneName());
           f.append("Drone Name " +D.getDroneName());
           f.append("Drone Id "+D.getDroneId());
           f.append("Drone load Capacity "+D.getLoadCapacity());
           //f.append("Drone load Capacity "+D.getBattery());
           f.append("\n");

           f.flush();
         //  f.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public void load(ArrayList<Drone>D, String filename)
    {
        for(int i = 0; i<D.size(); i++)
        {
            save(D.get(i),filename);
        }

    }
    public void save(ArrayList<Drone> D, String filename)
    {
        for(int i = 0; i<D.size(); i++)
        {
            save(D.get(i),filename);
        }
    }
}
