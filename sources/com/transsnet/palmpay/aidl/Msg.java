package com.transsnet.palmpay.aidl;

import C0.G;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class Msg implements Parcelable {
    public static final Parcelable.Creator<Msg> CREATOR = new Parcelable.Creator<Msg>() { // from class: com.transsnet.palmpay.aidl.Msg.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Msg createFromParcel(Parcel parcel) {
            return new Msg(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Msg[] newArray(int i7) {
            return new Msg[i7];
        }
    };
    public int code;
    public String message;

    public Msg(int i7, String str) {
        this.code = i7;
        this.message = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Msg{code=");
        sb2.append(this.code);
        sb2.append(", message='");
        return G.r(sb2, this.message, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.code);
        parcel.writeString(this.message);
    }

    public Msg(Parcel parcel) {
        this.code = parcel.readInt();
        this.message = parcel.readString();
    }
}
