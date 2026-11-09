package com.transsnet.palmpay.core.bean;

/* JADX INFO: loaded from: classes3.dex */
public class LocationRecord {
    private double latitude;
    private double longitude;
    private long updateTime;

    public LocationRecord(double latitude, double longitude, long updateTime) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.updateTime = updateTime;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public PalmPayLatLng getLocation() {
        return new PalmPayLatLng(this.latitude, this.longitude, this.updateTime);
    }

    public double getLongitude() {
        return this.longitude;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public boolean isExpired() {
        return this.updateTime + 600000 <= System.currentTimeMillis();
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public String toString() {
        return String.valueOf(this.latitude) + "," + String.valueOf(this.longitude) + "," + String.valueOf(this.updateTime);
    }

    public LocationRecord(PalmPayLatLng latLng, long updateTime) {
        this(latLng.latitude, latLng.longitude, updateTime);
    }

    public LocationRecord(PalmPayLatLng latLng) {
        this(latLng.latitude, latLng.longitude, System.currentTimeMillis());
    }

    public LocationRecord(String locationStr) {
        try {
            String[] strArrSplit = locationStr.split(",");
            this.latitude = Double.parseDouble(strArrSplit[0]);
            this.longitude = Double.parseDouble(strArrSplit[1]);
            this.updateTime = System.currentTimeMillis();
            if (strArrSplit.length >= 3) {
                this.updateTime = Long.parseLong(strArrSplit[2]);
            }
        } catch (Exception unused) {
            throw new IllegalArgumentException();
        }
    }
}
