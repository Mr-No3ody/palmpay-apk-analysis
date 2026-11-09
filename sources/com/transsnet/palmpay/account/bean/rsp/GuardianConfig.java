package com.transsnet.palmpay.account.bean.rsp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class GuardianConfig implements Parcelable {
    public static final Parcelable.Creator<GuardianConfig> CREATOR = new Parcelable.Creator<GuardianConfig>() { // from class: com.transsnet.palmpay.account.bean.rsp.GuardianConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GuardianConfig createFromParcel(Parcel parcel) {
            return new GuardianConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GuardianConfig[] newArray(int i7) {
            return new GuardianConfig[i7];
        }
    };
    public String addGuardianContent;
    public String addGuardianTitle;
    public String birthCertificatePic;
    public ArrayList<String> notes;
    public String unGuardianShipPic;

    public GuardianConfig() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.notes);
        parcel.writeString(this.addGuardianTitle);
        parcel.writeString(this.addGuardianContent);
        parcel.writeString(this.birthCertificatePic);
        parcel.writeString(this.unGuardianShipPic);
    }

    public GuardianConfig(Parcel parcel) {
        this.notes = parcel.createStringArrayList();
        this.addGuardianTitle = parcel.readString();
        this.addGuardianContent = parcel.readString();
        this.birthCertificatePic = parcel.readString();
        this.unGuardianShipPic = parcel.readString();
    }
}
