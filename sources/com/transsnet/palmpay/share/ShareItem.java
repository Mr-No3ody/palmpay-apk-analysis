package com.transsnet.palmpay.share;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.g;

/* JADX INFO: loaded from: classes4.dex */
public class ShareItem implements Parcelable {
    public static final Parcelable.Creator<ShareItem> CREATOR = new g(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f34113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f34114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f34115g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f34116i;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f34109a);
        parcel.writeInt(this.f34110b);
        parcel.writeInt(this.f34111c);
        parcel.writeString(this.f34112d);
        parcel.writeString(this.f34113e);
        parcel.writeString(this.f34114f);
        parcel.writeString(this.f34115g);
        parcel.writeString(this.f34116i);
    }
}
