package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class DroneScheduler {
    //ArrayList and HashMap
    private ArrayList <DroneTask> arr;
    private HashMap<String,ArrayList<DroneTask> > HM;





    // Get arraylist of Tasks by providing droneId (corresponding to one droneId there can be multiple Tasks)
    public ArrayList<DroneTask> retreivalById(String Id)
    {
        return HM.get(Id);
    }

    /*public DroneTask getArr(DroneTask T) {
        return new arr<T>;
    }*/

    public void addArr(DroneTask T) {
        this.arr.add(T);
        //If droneId exists add Task object to ArrayList of corrsponding drone ID
        if(HM.containsKey(T.getDroneId())) {
           ArrayList<DroneTask>d= HM.get(T.getDroneId());
           d.add(T);
        }
      //If droneId do not exist add droneId and Tasks both.
        else
        {
            ArrayList<DroneTask>d=new ArrayList<DroneTask>();
            d.add(T);
            HM.put(T.getDroneId(),d);
        }
    }
    //consructor

    public DroneScheduler() {
        this.arr= new ArrayList<DroneTask>();
        this.HM=new HashMap<String,ArrayList<DroneTask>>();
    }
    //Remove Tasks

    public void removeTask(DroneTask T)
    {
        arr.remove(T);
       ArrayList<DroneTask>d= HM.get(T.getDroneId());
       d.remove(T);
    }


  //getter Methods
    public ArrayList<DroneTask> getArr() {
        return arr;
    }

    public HashMap<String, ArrayList<DroneTask>> getHM() {
        return HM;
    }
   //Print ArrayList ellements
    public void printArrayList()
    {
        for(int i=0;i<this.arr.size();i++)
        {
            printTask(arr.get(i));
        }
    }
    //DroneTask

    public void printTask(DroneTask T)
    {
       System.out.println("Task Name:"+T.getTaskName() + " Drone Id is "+ T.getDroneId());
    }
}
