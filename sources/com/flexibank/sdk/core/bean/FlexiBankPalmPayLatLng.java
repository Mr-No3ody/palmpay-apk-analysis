package com.flexibank.sdk.core.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Parcelize
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/flexibank/sdk/core/bean/FlexiBankPalmPayLatLng;", "Landroid/os/Parcelable;", "", "latitude", "D", "getLatitude", "()D", "setLatitude", "(D)V", "longitude", "getLongitude", "setLongitude", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankPalmPayLatLng implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlexiBankPalmPayLatLng> CREATOR = new a();
    private double latitude;
    private double longitude;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FlexiBankPalmPayLatLng> {
        @Override // android.os.Parcelable.Creator
        public final FlexiBankPalmPayLatLng createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FlexiBankPalmPayLatLng(parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final FlexiBankPalmPayLatLng[] newArray(int i7) {
            return new FlexiBankPalmPayLatLng[i7];
        }
    }

    public FlexiBankPalmPayLatLng() {
        this(0.0d, 0.0d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.latitude);
        dest.writeDouble(this.longitude);
    }

    public FlexiBankPalmPayLatLng(double d2, double d10) {
        this.latitude = d2;
        this.longitude = d10;
    }
}
