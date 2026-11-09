package com.transsnet.palmpay.core.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class RemindListBean implements Parcelable {
    public static final Parcelable.Creator<RemindListBean> CREATOR = new Parcelable.Creator<RemindListBean>() { // from class: com.transsnet.palmpay.core.bean.RemindListBean.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemindListBean createFromParcel(Parcel source) {
            return new RemindListBean(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemindListBean[] newArray(int size) {
            return new RemindListBean[size];
        }
    };
    public String accountId;
    public String paymentType;
    public int remindHour;
    public String remindPeriod;
    public String remindTime;
    public int reminder;

    public RemindListBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel source) {
        this.accountId = source.readString();
        this.paymentType = source.readString();
        this.remindHour = source.readInt();
        this.remindPeriod = source.readString();
        this.remindTime = source.readString();
        this.reminder = source.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.accountId);
        dest.writeString(this.paymentType);
        dest.writeInt(this.remindHour);
        dest.writeString(this.remindPeriod);
        dest.writeString(this.remindTime);
        dest.writeInt(this.reminder);
    }

    public RemindListBean(Parcel in) {
        this.accountId = in.readString();
        this.paymentType = in.readString();
        this.remindHour = in.readInt();
        this.remindPeriod = in.readString();
        this.remindTime = in.readString();
        this.reminder = in.readInt();
    }
}
