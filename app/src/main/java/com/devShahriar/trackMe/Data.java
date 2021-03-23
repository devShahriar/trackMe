package com.devShahriar.trackMe;

public class Data {

    public String getUserId() {
        return userId;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongtitude() {
        return longtitude;
    }

    private String userId ;
    private String latitude;
    private String longtitude;
    public Data(String userId , String latitude, String longtitude){
        this.userId = userId;
        this.latitude = latitude;
        this.longtitude = longtitude;
    }
}
