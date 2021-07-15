package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Please enter a location")
    private String location;

    public Employer (String location) {
        this.location = location;
    }

    // No arg constructor
    public Employer () {}


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
