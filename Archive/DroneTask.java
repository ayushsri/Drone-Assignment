package com.company;

public class DroneTask {
    private String Id;
    private String TaskName;
    private String Objective;
    private String StartDate;

    public String getDroneId() {
        return droneId;
    }

    public void setDroneId(String droneId) {
        this.droneId = droneId;
    }

    public DroneTask(String id, String taskName, String objective, String startDate, String startTime) {
        Id = id;
        TaskName = taskName;
        Objective = objective;
        StartDate = startDate;
        StartTime = startTime;
    }

    private String StartTime;
    private String droneId;
    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getTaskName() {
        return TaskName;
    }

    public void setTaskName(String taskName) {
        TaskName = taskName;
    }

    public String getObjective() {
        return Objective;
    }

    public void setObjective(String objective) {
        Objective = objective;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }



}
