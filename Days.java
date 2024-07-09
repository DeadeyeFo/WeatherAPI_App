package org.example;

public class Days {
    private String datetime;
    private double tempmax;
    private double tempmin;
    private double temp;
    private double precipprob;
    private String conditions;
    private String description;

    // Getters and setters
    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public double getTempmax() {
        return tempmax;
    }

    public void setTempmax(double tempmax) {
        this.tempmax = tempmax;
    }

    public double getTempmin() {
        return tempmin;
    }

    public void setTempmin(double tempmin) {
        this.tempmin = tempmin;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getPrecipprob() {
        return precipprob;
    }

    public void setPrecipprob(double precipprob) {
        this.precipprob = precipprob;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Date: " + datetime + ", Temp Max: " + tempmax + ", Temp Min: " + tempmin +
                ", Temp: " + temp + ", Precipitation Probability: " + precipprob +
                ", Conditions: " + conditions + ", Description: " + description;
    }
}
