package com.transsnet.palmpay.common.export.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public class PickLocationReq implements Parcelable {
    public static final Parcelable.Creator<PickLocationReq> CREATOR = new Parcelable.Creator<PickLocationReq>() { // from class: com.transsnet.palmpay.common.export.bean.PickLocationReq.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PickLocationReq createFromParcel(Parcel parcel) {
            return new PickLocationReq(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PickLocationReq[] newArray(int i7) {
            return new PickLocationReq[i7];
        }
    };
    public String address;
    public String latitude;
    public String longitude;
    public String message;
    public String subTitle;
    public String title;

    public PickLocationReq() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLng getLocation() {
        try {
            return new LatLng(Double.parseDouble(this.latitude), Double.parseDouble(this.longitude));
        } catch (Exception unused) {
            return null;
        }
    }

    public void readFromParcel(Parcel parcel) {
        this.title = parcel.readString();
        this.subTitle = parcel.readString();
        this.message = parcel.readString();
        this.address = parcel.readString();
        this.latitude = parcel.readString();
        this.longitude = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        parcel.writeString(this.message);
        parcel.writeString(this.address);
        parcel.writeString(this.latitude);
        parcel.writeString(this.longitude);
    }

    public PickLocationReq(Parcel parcel) {
        this.title = parcel.readString();
        this.subTitle = parcel.readString();
        this.message = parcel.readString();
        this.address = parcel.readString();
        this.latitude = parcel.readString();
        this.longitude = parcel.readString();
    }
}
