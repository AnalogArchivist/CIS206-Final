/*
 File: Main.java
 Description: This is the Mountain file for my project and designed to hold the Private Variables, Setters, Getters, and (The ft to m) converter
 Created: Thur. Jun 8, 2023, 7:30pm
 Author: Sofiya Escareno
 email: sofiyae0153@student.vvc.edu
*/

//This class contains details about the mountain
public class Mountain {
    
    //Declaring Private Variables 
    private String name; 
    private String country; 
    private double elevation; 
    
    //Setters for Name, Country, and Elevation
    public void setName(String name) { 
        this.name = name;
    }
    public void setCountry(String country) { 
        this.country = country;
    }
    public void setElevation(double elevation) { 
        this.elevation = elevation;
    }
    
    //Getters for Name, Country, and Elevation
    public String getName() { 
        return name;
    }
    public String getCountry() { 
        return country;
    }
    public double getElevation() { 
        return elevation;
    }
    
    // Converts Feet to Meters
    public double toMeters() { 
        return this.elevation/3.2808;
    }
}