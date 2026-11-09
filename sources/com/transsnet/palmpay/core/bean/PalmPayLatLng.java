package com.transsnet.palmpay.core.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class PalmPayLatLng implements Parcelable {
    public static final Parcelable.Creator<PalmPayLatLng> CREATOR = new Parcelable.Creator<PalmPayLatLng>() { // from class: com.transsnet.palmpay.core.bean.PalmPayLatLng.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PalmPayLatLng createFromParcel(Parcel source) {
            return new PalmPayLatLng(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PalmPayLatLng[] newArray(int size) {
            return new PalmPayLatLng[size];
        }
    };
    public double latitude;
    public long locateTime;
    public double longitude;

    public PalmPayLatLng(double latitude, double longitude, long locateTime) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.locateTime = locateTime;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(this.latitude);
        dest.writeDouble(this.longitude);
        dest.writeLong(this.locateTime);
    }

    public PalmPayLatLng() {
    }

    public PalmPayLatLng(Parcel in) {
        this.latitude = in.readDouble();
        this.longitude = in.readDouble();
        this.locateTime = in.readLong();
    }
}
