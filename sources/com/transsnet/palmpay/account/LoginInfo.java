package com.transsnet.palmpay.account;

import C0.G;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.g;

/* JADX INFO: loaded from: classes3.dex */
public class LoginInfo implements Parcelable {
    public static final Parcelable.Creator<LoginInfo> CREATOR = new g(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f25778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f25780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f25781d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LoginInfo{token='");
        sb2.append(this.f25778a);
        sb2.append("', memberId='");
        sb2.append(this.f25779b);
        sb2.append("', phoneNumber='");
        sb2.append(this.f25780c);
        sb2.append("', fullName='");
        return G.r(sb2, this.f25781d, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f25778a);
        parcel.writeString(this.f25779b);
        parcel.writeString(this.f25780c);
        parcel.writeString(this.f25781d);
    }
}
