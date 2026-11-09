package com.transsnet.palmpay.account.bean.rsp;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class BvnIdentityInfoRsp implements Parcelable {
    public static final Parcelable.Creator<BvnIdentityInfoRsp> CREATOR = new Parcelable.Creator<BvnIdentityInfoRsp>() { // from class: com.transsnet.palmpay.account.bean.rsp.BvnIdentityInfoRsp.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BvnIdentityInfoRsp createFromParcel(Parcel parcel) {
            return new BvnIdentityInfoRsp(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BvnIdentityInfoRsp[] newArray(int i7) {
            return new BvnIdentityInfoRsp[i7];
        }
    };
    public String birthday;
    public String bvnHide;
    public String firstNameHide;
    public String lastNameHide;
    public String middleNameHide;
    public String ninHide;

    public BvnIdentityInfoRsp() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.bvnHide = parcel.readString();
        this.firstNameHide = parcel.readString();
        this.middleNameHide = parcel.readString();
        this.lastNameHide = parcel.readString();
        this.birthday = parcel.readString();
        this.ninHide = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.bvnHide);
        parcel.writeString(this.firstNameHide);
        parcel.writeString(this.middleNameHide);
        parcel.writeString(this.lastNameHide);
        parcel.writeString(this.birthday);
        parcel.writeString(this.ninHide);
    }

    public BvnIdentityInfoRsp(Parcel parcel) {
        this.bvnHide = parcel.readString();
        this.firstNameHide = parcel.readString();
        this.middleNameHide = parcel.readString();
        this.lastNameHide = parcel.readString();
        this.birthday = parcel.readString();
        this.ninHide = parcel.readString();
    }
}
