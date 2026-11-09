package com.github.mikephil.charting.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.g;

/* JADX INFO: loaded from: classes.dex */
public class Entry implements Parcelable {
    public static final Parcelable.Creator<Entry> CREATOR = new g(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f22445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Parcelable f22446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f22447c;

    public float c() {
        return this.f22445a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Entry, x: " + this.f22447c + " y: " + c();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(this.f22447c);
        parcel.writeFloat(c());
        if (this.f22446b == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(this.f22446b, i7);
        }
    }
}
