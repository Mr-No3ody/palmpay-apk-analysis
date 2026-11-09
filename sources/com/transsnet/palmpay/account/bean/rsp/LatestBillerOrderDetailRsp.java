package com.transsnet.palmpay.account.bean.rsp;

import android.os.Parcel;
import android.os.Parcelable;
import com.transsnet.palmpay.core.bean.BaseOrderDetailBean;

/* JADX INFO: loaded from: classes3.dex */
public class LatestBillerOrderDetailRsp implements Parcelable {
    public static final Parcelable.Creator<LatestBillerOrderDetailRsp> CREATOR = new Parcelable.Creator<LatestBillerOrderDetailRsp>() { // from class: com.transsnet.palmpay.account.bean.rsp.LatestBillerOrderDetailRsp.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LatestBillerOrderDetailRsp createFromParcel(Parcel parcel) {
            return new LatestBillerOrderDetailRsp(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LatestBillerOrderDetailRsp[] newArray(int i7) {
            return new LatestBillerOrderDetailRsp[i7];
        }
    };
    public String areaCode;
    public String areaName;
    public String lgaCode;
    public String lgaName;
    public OrderDataBean orderInfo;
    public String stateCode;
    public String stateName;

    public class OrderDataBean extends BaseOrderDetailBean {
        public String address;
        public String icon;

        public OrderDataBean() {
        }
    }

    public LatestBillerOrderDetailRsp() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.stateCode = parcel.readString();
        this.stateName = parcel.readString();
        this.areaCode = parcel.readString();
        this.areaName = parcel.readString();
        this.lgaCode = parcel.readString();
        this.lgaName = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.stateCode);
        parcel.writeString(this.stateName);
        parcel.writeString(this.areaCode);
        parcel.writeString(this.areaName);
        parcel.writeString(this.lgaCode);
        parcel.writeString(this.lgaName);
    }

    public LatestBillerOrderDetailRsp(Parcel parcel) {
        this.stateCode = parcel.readString();
        this.stateName = parcel.readString();
        this.areaCode = parcel.readString();
        this.areaName = parcel.readString();
        this.lgaCode = parcel.readString();
        this.lgaName = parcel.readString();
    }
}
