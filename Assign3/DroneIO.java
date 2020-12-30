//package com.company;


import com.sun.tools.javac.util.List;

import java.io.*;
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
           f.append("Drone speed "+D.getSpeed());
           f.append("Drone x pos"+D.getCurPosX());
           f.append("Drone y pos"+ D.getCurPosY());
           f.append("Drone heading"+D.getHeading());
           //f.append("Drone load Capacity "+D.getBattery());
            if( D instanceof TransPortDrone)
            { f.append("Drone height"+ ((TransPortDrone) D).getHeightCargo());
                f.append("Drone width"+ (((TransPortDrone) D).getWidthCargo()));
                f.append("Drone lentgh"+(((TransPortDrone) D).getLengthCargo()));

            }

           f.append("\n");

           f.flush();
         //  f.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public void load(ArrayList<Drone>D, String filename)
    {

        FileReader f;
        try {
            f = new FileReader(filename);
            BufferedReader in = new BufferedReader(f);
            String inputLine;
            int i = 0;
            while (i < D.size()) {
                try {
                    Drone Dnew = D.get(i);
                    while ((inputLine = in.readLine()) != null) {
                        String s1,s2,s3,s4,s5,s6,s7,s8,s9;
                        Drone d;
                        inputLine = inputLine.trim();
                        inputLine = inputLine.substring(inputLine.indexOf(" ")).trim();
                        inputLine = inputLine.substring(inputLine.indexOf(" ")).trim();

                            s1 = inputLine.substring(0, inputLine.indexOf(" ")).trim();
                            inputLine = inputLine.substring(inputLine.indexOf(" ")).trim();
                            s2 = inputLine.substring(0, inputLine.indexOf(" ")).trim();
                            inputLine = inputLine.substring(inputLine.indexOf(" ")).trim();
                            s3 = inputLine.substring(0, inputLine.indexOf(" ")).trim();
                            inputLine = inputLine.substring(inputLine.indexOf(" ")).trim();
                            s4 = inputLine.substring(0, inputLine.indexOf(" ")).trim();
                            inputLine = inputLine.substring(inputLine.indexOf(" ")).trim();
                            s5 = inputLine.substring(0, inputLine.indexOf(" ")).trim();
                            inputLine = inputLine.substring(inputLine.indexOf(" ")).trim();
                            s6 = inputLine.substring(0, inputLine.indexOf(" ")).trim();
                            inputLine = inputLine.substring(inputLine.indexOf(" ")).trim();
                            s7 = inputLine.substring(0, inputLine.indexOf(" ")).trim();
                            inputLine = inputLine.substring(inputLine.indexOf(" ")).trim();
                        s8= inputLine.substring(0, inputLine.indexOf(" ")).trim();
                        inputLine = inputLine.substring(inputLine.indexOf(" ")).trim();
                        s9= inputLine.substring(0, inputLine.indexOf(" ")).trim();
                        if (D.get(i) instanceof Drone)
                        { d = new Drone(s1, s2, Double.parseDouble(s3), Double.parseDouble(s4), Double.parseDouble(s5), Double.parseDouble(s6));}
                        else
                        {  d = new TransPortDrone(s1, s2, Double.parseDouble(s3), Double.parseDouble(s4), Double.parseDouble(s5), Double.parseDouble(s6),Integer.parseInt(s7),Integer.parseInt(s8),Integer.parseInt(s9));}
                            Dnew = d;
                        i++;
                    }
                } catch (IOException e) {

                    e.printStackTrace();
                }



        }} catch (FileNotFoundException e) {
            e.printStackTrace();
        }}


        public void save(ArrayList<Drone> D, String filename)
    {
        for(int i = 0; i<D.size(); i++)
        {
            save(D.get(i),filename);
        }
    }
}
