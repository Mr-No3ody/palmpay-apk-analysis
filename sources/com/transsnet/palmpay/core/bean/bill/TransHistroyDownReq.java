package com.transsnet.palmpay.core.bean.bill;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class TransHistroyDownReq extends TransHistoryReq implements Parcelable {
    public static final Parcelable.Creator<TransHistroyDownReq> CREATOR = new Parcelable.Creator<TransHistroyDownReq>() { // from class: com.transsnet.palmpay.core.bean.bill.TransHistroyDownReq.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TransHistroyDownReq createFromParcel(Parcel source) {
            return new TransHistroyDownReq(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TransHistroyDownReq[] newArray(int size) {
            return new TransHistroyDownReq[size];
        }
    };
    public int includeAddress;
    public String receiveEmail;

    public TransHistroyDownReq() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.beginTime);
        parcel.writeLong(this.endTime);
        parcel.writeInt(this.inOutFlag);
        parcel.writeString(this.transType);
    }

    public TransHistroyDownReq(Parcel in) {
        this.beginTime = in.readLong();
        this.endTime = in.readLong();
        this.inOutFlag = in.readInt();
        this.transType = in.readString();
    }
}
