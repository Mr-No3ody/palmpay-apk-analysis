package com.transsnet.palmpay.core.bean.rsp;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class LinkedAccountDataInfo implements Parcelable {
    public static final Parcelable.Creator<LinkedAccountDataInfo> CREATOR = new Parcelable.Creator<LinkedAccountDataInfo>() { // from class: com.transsnet.palmpay.core.bean.rsp.LinkedAccountDataInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LinkedAccountDataInfo createFromParcel(Parcel in) {
            return new LinkedAccountDataInfo(in);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LinkedAccountDataInfo[] newArray(int size) {
            return new LinkedAccountDataInfo[size];
        }
    };
    public String accountId;
    public String authModel;
    public String authUrl;
    public String channel;
    public String referenceId;
    public String status;

    public LinkedAccountDataInfo(Parcel in) {
        this.accountId = in.readString();
        this.referenceId = in.readString();
        this.channel = in.readString();
        this.authUrl = in.readString();
        this.authModel = in.readString();
        this.status = in.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.accountId);
        dest.writeString(this.referenceId);
        dest.writeString(this.channel);
        dest.writeString(this.authUrl);
        dest.writeString(this.authModel);
        dest.writeString(this.status);
    }
}
