package com.tencent.mmkv;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.databinding.g;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class ParcelableMMKV implements Parcelable {
    public static final Parcelable.Creator<ParcelableMMKV> CREATOR = new g(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25529d;

    public ParcelableMMKV(String str, int i7, int i10, String str2) {
        this.f25526a = str;
        this.f25527b = i7;
        this.f25528c = i10;
        this.f25529d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        try {
            parcel.writeString(this.f25526a);
            ParcelFileDescriptor parcelFileDescriptorFromFd = ParcelFileDescriptor.fromFd(this.f25527b);
            ParcelFileDescriptor parcelFileDescriptorFromFd2 = ParcelFileDescriptor.fromFd(this.f25528c);
            int i10 = i7 | 1;
            parcelFileDescriptorFromFd.writeToParcel(parcel, i10);
            parcelFileDescriptorFromFd2.writeToParcel(parcel, i10);
            String str = this.f25529d;
            if (str != null) {
                parcel.writeString(str);
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }
}
