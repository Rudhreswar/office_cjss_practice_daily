package com.tasks.task2.data;

public class Location {
    private long locationId;
    private String locationName;
    private String locationCountry;


    public Location(long locationId, String locationName, String locationCountry) {
        this.locationId = locationId;
        this.locationName = locationName;
        this.locationCountry = locationCountry;
    }


    public String getLocationCountry() {
        return locationCountry;
    }

    public void setLocationCountry(String locationCountry) {
        this.locationCountry = locationCountry;
    }


    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }


}
